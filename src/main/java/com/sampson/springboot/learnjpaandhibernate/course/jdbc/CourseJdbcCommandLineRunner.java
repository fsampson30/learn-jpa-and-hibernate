package com.sampson.springboot.learnjpaandhibernate.course.jdbc;


import com.sampson.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS","Sampson"));
        repository.insert(new Course(2,"Learn Docker","Sampson"));
        repository.insert(new Course(3,"Learn Azure","Sampson"));
        repository.insert(new Course(4,"Learn DevOps","Sampson"));
        repository.delete(4);
    }
}
