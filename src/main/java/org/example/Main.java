package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeManager.getEmployees();

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.print("\nModified Stream ------------------------------------------------- \n");

        Map<Integer, String> idNameMap = employeeList.stream()
                .filter(employee -> employee.getAge() > 18 && employee.getSalary() > 1000)
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) // Sorting in descending order by salary
                .peek(employee -> {
                    // Subtract 20% of salary for every employee except the first one
                    if (employeeList.indexOf(employee) != 0) {
                        double newSalary = employee.getSalary() - (0.2 * employee.getSalary());
                        employee.setSalary(newSalary);
                    }
                })
                .collect(Collectors.toMap(
                        Employee::getId,
                        employee -> employee.getFirstName() + " " + employee.getLastName()
                ));

        // Displaying the map
        idNameMap.forEach((id, name) -> System.out.println(id + " - " + name));
    }
}
