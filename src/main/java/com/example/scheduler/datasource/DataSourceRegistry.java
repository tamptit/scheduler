package com.example.scheduler.datasource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
public class DataSourceRegistry {

    private final Map<String, DataSource> dataSourceMap = new HashMap<>();

    public void initialize(List<DBConfigDTO> configs) {
        for (DBConfigDTO config : configs) {
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setUrl(config.getUrl());
            ds.setUsername(config.getUsername());
            ds.setPassword(config.getPassword());
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // adjust if needed

            dataSourceMap.put(config.getName(), ds);
        }
    }

    public JdbcTemplate getJdbcTemplate(String name) {
        DataSource ds = dataSourceMap.get(name);
        System.out.println("--------------called---------------");
        return new JdbcTemplate(ds);
    }

    public Set<String> getSourceNames() {
        return dataSourceMap.keySet();
    }
}
