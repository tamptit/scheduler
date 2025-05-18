package com.example.data.query;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class QueryRegistry {
    private final Map<String, QueryMapping> registry = new HashMap<>();

    public void register(String tableName, String query, Class<?> targetClass) {
        registry.put(tableName, new QueryMapping(query, targetClass));
    }

    public QueryMapping getQueries(String tableName) {
        return registry.getOrDefault(tableName, null);
    }
}

