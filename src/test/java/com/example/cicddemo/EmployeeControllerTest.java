package com.example.cicddemo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeControllerTest {

    @Test
    void shouldReturnEmployees() {

        EmployeeController controller = new EmployeeController();

        List<String> employees = controller.getEmployees();

        assertEquals(5, employees.size());
        assertEquals("John - Software Developer", employees.get(0));
    }
}
