package com.camp.mydb;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class MemberDAO {

    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public int getRowCount() {
        String sqlStatement = "select count(*) from sample";
        return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
    }
}
