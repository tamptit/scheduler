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
        List<TableSourceDTO> dbs = List.of(
                new TableSourceDTO("SELECT * FROM resident_citizen WHERE updated_date >= ?","resident_citizen", "jdbc:mysql://localhost/resident_citizen", "root", "root123"),
                new TableSourceDTO("SELECT * FROM nat_citizen WHERE updated_date >= ?","sync_natcitizen", "jdbc:mysql://localhost/sync_natcitizen", "root", "root123")
//              define table and it's query need sync
        );

        registry.initialize(dbs);
    }
}
