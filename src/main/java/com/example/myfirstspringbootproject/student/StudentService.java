package com.example.myfirstspringbootproject.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
