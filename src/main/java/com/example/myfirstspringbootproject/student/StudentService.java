package com.example.myfirstspringbootproject.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component
@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L, "Aafiq", "aafiq@gmail.com",
                        LocalDate.of(2009, Month.MARCH, 23), 14
                )
        );
    }
}
