package com.sampson.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            """ 
            insert into course values (1,'Learn AWS','Sampson');
            """;

    public void insert(){
        jdbcTemplate.update(INSERT_QUERY);
    }
}
