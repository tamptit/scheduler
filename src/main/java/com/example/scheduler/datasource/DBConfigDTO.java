package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DBConfigDTO {

    private String name;
    private String url;
    private String username;
    private String password;

}
