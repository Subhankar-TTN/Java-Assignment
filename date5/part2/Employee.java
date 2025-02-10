package com.java.company.date5.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Employee {
    String name;
    int age;
    String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }
    // Overriding equals() and hashCode() to ensure that Employee objects can be used as keys in a Map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
      HashMap<Employee,Double>employeeHashMap = new HashMap<>();
      Employee emp1 = new Employee("Aniket",19,"Software Engineer I");
      Employee emp2 = new Employee("Ramesh",26,"Data Analyst");
      Employee emp3 = new Employee("Rahul",28,"Senior System Engineer");
      Employee emp4 = new Employee("Anushka",32,"Assistant Team Leader");

      //put the values in the employeeHashMap
        employeeHashMap.put(emp1,70000.50);
        employeeHashMap.put(emp2,80000.00);
        employeeHashMap.put(emp3,150000.50);
        employeeHashMap.put(emp4,100000.00);

        // Display the Map
        for (Map.Entry<Employee, Double> entry : employeeHashMap.entrySet()) {
            System.out.println(entry.getKey() + " | Salary: $" + entry.getValue());
        }

    }
}
