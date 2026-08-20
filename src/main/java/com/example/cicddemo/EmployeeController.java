package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<String> getEmployees() {
        return List.of(
                "John - Software Developer",
                "Sarah - QA Engineer",
                "Mike - DevOps Engineer",
                "Emma - Cloud Engineer"
        );
    }
}
