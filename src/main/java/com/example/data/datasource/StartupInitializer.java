package com.example.data.datasource;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StartupInitializer {

    @Autowired
    private DataSourceRegistry registry;

    @PostConstruct
    public void loadSources() {
        List<SourceDTO> dbs = List.of(
                new SourceDTO(List.of("admin_role","admin_function"),
                        "source_125", "jdbc:mysql://localhost/resident_citizen", "root", "root123"),
                new SourceDTO(List.of("group_member"),
                        "129_netteza", "jdbc:mysql://localhost/sync_natcitizen", "root", "root123")
//              define table and it's query need sync
        );
        Map<String, List<String>> qs = new HashMap<>();
        qs.put("source_125", List.of("select * from admin_role","select * from admin_function"));
        qs.put("source_129", List.of("select * from v_user_role","select * from group_member"));

        registry.initialize(dbs,qs);
    }
}
