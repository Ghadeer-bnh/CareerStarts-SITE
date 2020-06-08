package com.example.site.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CareerStartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareerStartsApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            // Runnable code goes here
            System.out.println("*** start Spring Command Line Runner ***");

            System.out.println("*** end Spring Command Line Runner ***");
        };
    }
}
