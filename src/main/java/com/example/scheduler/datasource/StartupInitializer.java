package com.example.scheduler.datasource;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartupInitializer {

    @Autowired
    private DataSourceRegistry registry;

    @PostConstruct
    public void loadSources() {
        List<DBConfigDTO> dbs = List.of(
                new DBConfigDTO("source", "jdbc:mysql://localhost/resident_citizen", "root", "root123"),
//                new DbConfig("source2", "jdbc:mysql://localhost/resident_citizen", "user", "pass"),
                new DBConfigDTO("target", "jdbc:mysql://localhost/sync_natcitizen", "root", "root123")
        );

        registry.initialize(dbs);
    }
}
