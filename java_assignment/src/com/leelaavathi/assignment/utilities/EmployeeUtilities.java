package com.leelaavathi.assignment.utilities;
import com.leelaavathi.assignment.employees.Employee;

public class EmployeeUtilities {

    /**
     * Increase the salary of an employee by a percentage.
     */
    public static void increaseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
        System.out.println("Updated Salary: " + emp.getSalary());
    }

    /**
     * Display employee details.
     */
    public static void displayEmployee(Employee emp) {
        System.out.println(emp.toString());
    }
}
