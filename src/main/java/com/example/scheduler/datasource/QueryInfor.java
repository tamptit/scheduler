package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class QueryInfor {
    int id;
    String sourceName;
    List<String> query;
}
