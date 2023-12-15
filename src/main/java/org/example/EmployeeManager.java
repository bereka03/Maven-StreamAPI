package org.example;

import java.util.ArrayList;
import java.util.List;


public class EmployeeManager {
    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        // Creating 5 Employee objects and adding them to the list
        employees.add(new Employee(1, "giorga", "kucia", 30, 50000.0));
        employees.add(new Employee(2, "ana", "kucia", 28, 45000.0));
        employees.add(new Employee(3, "baia", "asanidze", 35, 60000.0));
        employees.add(new Employee(4, "gio", "gajishvili", 25, 40000.0));
        employees.add(new Employee(5, "guka", "kveniashvili", 32, 55000.0));

        return employees;
    }

}
