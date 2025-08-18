package com.leelaavathi.assignment;
import com.leelaavathi.assignment.employees.Manager;
import com.leelaavathi.assignment.employees.Developer;
import com.leelaavathi.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer
        Manager manager = new Manager("Indra", 101, 90000, "Sales");
        Developer developer = new Developer("Vinay", 102, 60000, "Java");

        // Display details
        EmployeeUtilities.displayEmployee(manager);
        EmployeeUtilities.displayEmployee(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        // Display after update
        EmployeeUtilities.displayEmployee(manager);
        EmployeeUtilities.displayEmployee(developer);
    }
}