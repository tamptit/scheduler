package com.example.scheduler.datasource;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TableAndQuery {
    private String sourceName;
    private List<QueryInfor> tbs;
}
