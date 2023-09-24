package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfigure {
@Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
    return  args -> {
        Student mehmet = new Student(1L, "mehmet",
                "mehmet@gmail.com",
                LocalDate.of(2000, Month.APRIL, 3), 23);
        Student asli = new Student(1L, "aslı",
                "aslı@gmail.com",
                LocalDate.of(2001, Month.APRIL, 2), 22);
        Student kerem = new Student(1L, "kerem",
                "kerem@gmail.com",
                LocalDate.of(2002, Month.MARCH, 1), 21);

        studentRepo.saveAll(List.of(mehmet,asli,kerem));
    };

}

}
