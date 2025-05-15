package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Getter
@Setter
@AllArgsConstructor
public class QueryAndDatasource {
    private String query;
    private DriverManagerDataSource ds;
}
