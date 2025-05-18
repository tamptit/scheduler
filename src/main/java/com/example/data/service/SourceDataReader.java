package com.example.data.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Component
public class SourceDataReader {

    public List<Map<String, Object>> readData(String url, String user, String pass, Timestamp lastUpdated) {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(url);
        ds.setUsername(user);
        ds.setPassword(pass);
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

        JdbcTemplate jdbc = new JdbcTemplate(ds);
        return jdbc.queryForList(
                "SELECT * FROM resident_citizen WHERE updated_date >= ?",
                lastUpdated
        );
    }
}