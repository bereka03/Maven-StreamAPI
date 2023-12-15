package org.example;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

}
