package com.sampson.springboot.learnjpaandhibernate.course;


import com.sampson.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.sampson.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "Learn AWS", "Sampson"));
//        repository.insert(new Course(2, "Learn Docker", "Sampson"));
//        repository.insert(new Course(3, "Learn Azure", "Sampson"));
//        repository.insert(new Course(4, "Learn DevOps", "Sampson"));
//        repository.deleteById(4);
//        System.out.println(repository.findById(1));

        repository.save(new Course(1, "Learn AWS", "Sampson"));
        repository.save(new Course(2, "Learn Docker", "Sampson"));
        repository.save(new Course(3, "Learn Azure", "Sampson"));
        repository.save(new Course(4, "Learn DevOps", "Sampson"));

        repository.deleteById(4L);

        System.out.println(repository.findById(1L));

    }
}
