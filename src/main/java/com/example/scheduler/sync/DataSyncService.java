package com.example.scheduler.sync;

import com.example.scheduler.datasource.DataSourceRegistry;
import com.example.scheduler.domain.TargetCitizen;
import com.example.scheduler.repository.national.TargetRepository;
import com.example.scheduler.repository.resident.SourceRepository;
import com.example.scheduler.service.SourceDataReader;
import com.example.scheduler.service.TargetWriter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class DataSyncService {

    @Autowired
    SourceDataReader reader;
    @Autowired TargetWriter writer;
    @Autowired
    private DataSourceRegistry registry;

    private Integer stt = 0;
//    @Transactional("sourceTransactionManager")
    @Scheduled(fixedDelay = 10000)
    public void sync() {
        Timestamp since = Timestamp.valueOf(LocalDateTime.now().minusMinutes(10));

        for (String source : registry.getSourceNames()) {
            JdbcTemplate jdbc = registry.getJdbcTemplate(source);
            System.out.println( stt++ + " get from " + source + " at: " + LocalDateTime.now());

            List<Map<String, Object>> rows = jdbc.queryForList(
                    "SELECT * FROM resident_citizen WHERE updated_date >= ?", since
            );
            List<TargetCitizen> users = rows.stream()
                    .map(this::mapRowToUser)
                    .toList();
            writer.write(users);
        }
    }

    private TargetCitizen mapRowToUser(Map<String, Object> row) {
        TargetCitizen u = new TargetCitizen();
        u.setId((String.valueOf(row.get("id"))));
        u.setName(String.valueOf(row.get("name")));
        return u;
    }

}
