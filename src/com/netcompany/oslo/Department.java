package com.netcompany.oslo;

import java.util.Arrays;

public class Department {
    private Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        try {
            employees[10] = new Employee(employee.getSsn(), employee.getName(), employee.getSalary());
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            throw aioobe;
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
