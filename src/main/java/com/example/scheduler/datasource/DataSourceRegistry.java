package com.example.scheduler.datasource;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class DataSourceRegistry {

    private final Map<String, DataSource> dataSourceMap = new HashMap<>();

    private final Map<String, String> queryTableMap = new HashMap<>();

    public void initialize(List<SourceDTO> configs, Map<String, List<String>> qs ) {
        for (SourceDTO config : configs) {
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setUrl(config.getUrl());
            ds.setUsername(config.getUsername());
            ds.setPassword(config.getPassword());
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // adjust if needed
//            QueryAndDatasource q = new QueryAndDatasource(config.getSourceName(), ds);
            dataSourceMap.put(config.getSourceName(), ds);
//            queryTableMap.put("source_125", List.of("select * from admin_role","select * from admin_function"));
//            queryTableMap.put("source_129", List.of("select * from v_user_role","select * from group_member"));

            queryTableMap.put("admin_role", "select * from admin_role");
            queryTableMap.put("group_member", "select * from group_member");
        }
    }

    public JdbcTemplate getJdbcTemplate(String name) {
        DataSource ds = dataSourceMap.get(name);
        System.out.println("--------------called " + name);
        return new JdbcTemplate(ds);
    }

    public String getQueryByTableName(String tableName) {
        return queryTableMap.get(tableName);
    }

    public Set<String> getSourceNames() {
        return dataSourceMap.keySet();
    }
}
