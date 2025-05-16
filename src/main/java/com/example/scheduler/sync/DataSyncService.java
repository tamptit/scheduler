package com.example.scheduler.sync;

import com.example.scheduler.datasource.DataSourceRegistry;
import com.example.scheduler.domain.target.ARole;
import com.example.scheduler.repository.target.ARoleRepository;
import com.example.scheduler.service.SourceDataReader;
import com.example.scheduler.service.TargetWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

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
//            System.out.println( stt++ +  registry.getQueryByTableAndSource(sourceName) + " at: " + LocalDateTime.now());

            List<Map<String, Object>> rows_admin_role = jdbc.queryForList(registry.getQueryByTableName("admin_role"), since);
            List<Map<String, Object>> rows_admin_function = jdbc.queryForList(registry.getQueryByTableName("admin_function"), since);
//            List<Map<String, Object>> rows_admin_role_function = jdbc.queryForList(registry.getQueryByTableName("admin_role_function"), since);
//            List<Map<String, Object>> rows_admin_role_user = jdbc.queryForList(registry.getQueryByTableName("admin_role_user"), since);
//            List<Map<String, Object>> rows_user_role = jdbc.queryForList(registry.getQueryByTableName("user_role"), since);

//            registry.getQueryBySource(sourceName).forEach(t -> {
//                List<Map<String, Object>> rows = jdbc.queryForList(t, since);
//            });

//            List<ARole> aRole = rows_admin_role.stream()
//                    .map(this::mapRowToARole)
//                    .toList();
//            writer.writeArole(aRole);

        }
    }

//    private ARole mapRowToARole(Map<String, Object> row) {
//        ARole u = new ARole();
//        u.setId(Integer.parseInt(row.get("id").toString()));
//        u.setRoleName(row.get("role_name").toString());
//        u.setRoleName(row.get("role_name").toString());
//        return u;
//    }

}
