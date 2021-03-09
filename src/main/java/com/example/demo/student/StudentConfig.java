package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository){
        return args -> {
            Student thinh = new Student(
                    "thinh",
                    "thinh@gmail.com",
                    LocalDate.of(2000, Month.JUNE,4)
            );

            Student lam = new Student(
                    "lam",
                    "lam@gmail.com",
                    LocalDate.of(2002, Month.JULY,4)
            );

            studentRepository.saveAll(
                    List.of(thinh,lam)
            );
        };
    }
}
