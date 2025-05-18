package com.example.data.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SourceDTO {

//    private String query;
    private List<String> tableName;
//    private List<String> query;
    private String sourceName;
    private String url;
    private String username;
    private String password;

}
