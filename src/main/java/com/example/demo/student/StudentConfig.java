package com.example.demo.student;

import java.time.Month;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repo) {
        return args -> {
            Student Kamal = new Student( "Kamal", "kamal@gmail.com", LocalDate.of(2000, Month.APRIL, 3), 22);
            Student Alex = new Student( "Alex", "Alex@gmail.com", LocalDate.of(2005, Month.APRIL, 21), 15);
            Student Lina = new Student( "Lina", "Lina@gmail.com", LocalDate.of(2000, Month.APRIL, 3), 22);

            repo.saveAll( List.of(Kamal, Alex, Lina));
        };
    }
}
