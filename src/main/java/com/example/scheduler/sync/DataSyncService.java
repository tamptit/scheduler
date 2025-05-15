package com.example.scheduler.sync;

import com.example.scheduler.datasource.DataSourceRegistry;
import com.example.scheduler.domain.TargetCitizen;
import com.example.scheduler.repository.national.TargetRepository;
import com.example.scheduler.repository.resident.SourceRepository;
import com.example.scheduler.service.SourceDataReader;
import com.example.scheduler.service.TargetWriter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
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

//    @ConfigurationProperties("${fixed-delay.in.milliseconds}")
//    private long fixDelay;

    private Integer stt = 0;
//    @Transactional("sourceTransactionManager")
    @Scheduled(fixedDelayString = "${fixed-delay.in.milliseconds}")
    public void sync() {
        Timestamp since = Timestamp.valueOf(LocalDateTime.now().minusMinutes(10));

        for (String sourceName : registry.getSourceNames()) {
            JdbcTemplate jdbc = registry.getJdbcTemplate(sourceName);
            System.out.println( stt++ +  registry.getQueryFromSource(sourceName) + " at: " + LocalDateTime.now());
            List<Map<String, Object>> rows = jdbc.queryForList(registry.getQueryFromSource(sourceName), since);
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
