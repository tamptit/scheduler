package com.example.scheduler.mapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementReader implements PreparedStatementSetter {

    private JdbcTemplate jdbcTemplate;
    private String sql;
    private final int fetchSize = 100;

    public PreparedStatementReader(JdbcTemplate jdbcTemplate, String sql) {
        if (jdbcTemplate == null){
            System.out.println("jdbc null");
        }else{
            this.jdbcTemplate = jdbcTemplate;
        }
        this.sql = sql;
    }

    @Override
    public void setValues(PreparedStatement ps) throws SQLException {
//        Connection connection = jdbcTemplate.getDataSource().getConnection();
//        connection.prepareCall(sql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
//        ps.setFetchSize(fetchSize);

    }
}
