package com.ch6Ass.Assignment6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import models.Student;

@SpringBootApplication
@ComponentScan(basePackages = {"controllers"})
//@ComponentScan(basePackages = {"repositories"})
@ComponentScan("repositories")//to scan repository files

@ComponentScan(basePackages = {"services"})

@EntityScan("models")
@EnableJpaRepositories("repositories")
public class Assignment6Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment6Application.class, args);
    }

}
