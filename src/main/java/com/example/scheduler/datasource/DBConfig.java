package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hk")
    public DataSourceProperties hkDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    public DataSource hkDataSource() {
        return hkDataSourceProperties().initializeDataSourceBuilder().build();
    }

}
