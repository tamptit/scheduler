package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TableSourceDTO {

    private String query;
//    private String tableName;
    private String sourceName;
    private String url;
    private String username;
    private String password;

}
