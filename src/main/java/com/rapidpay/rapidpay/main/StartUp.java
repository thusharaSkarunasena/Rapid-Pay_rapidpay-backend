package com.rapidpay.rapidpay.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration 
@EntityScan("com.rapidpay.rapidpay.model")
@ComponentScan("com.rapidpay.rapidpay.controller")
@ComponentScan("com.rapidpay.rapidpay.service")
@ComponentScan("com.rapidpay.rapidpay.repo")
@EnableJpaRepositories("com.rapidpay.rapidpay.repo.custom")
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

}
