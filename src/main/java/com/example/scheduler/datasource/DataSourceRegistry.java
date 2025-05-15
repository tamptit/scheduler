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

    private final Map<String, QueryAndDatasource> dataSourceMap = new HashMap<>();

    public void initialize(List<TableSourceDTO> configs) {
        for (TableSourceDTO config : configs) {
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setUrl(config.getUrl());
            ds.setUsername(config.getUsername());
            ds.setPassword(config.getPassword());
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // adjust if needed
            QueryAndDatasource q = new QueryAndDatasource(config.getQuery(), ds);
            dataSourceMap.put(config.getSourceName(), q);
        }
    }

    public JdbcTemplate getJdbcTemplate(String name) {
        DataSource ds = dataSourceMap.get(name).getDs();
        System.out.println("--------------called " + name);
        return new JdbcTemplate(ds);
    }

    public String getQueryFromSource(String sourceName) {
        return dataSourceMap.get(sourceName).getQuery();
    }

    public Set<String> getSourceNames() {
        return dataSourceMap.keySet();
    }
}
