package com.netcompany.oslo;

public class Employee {

    private int ssn ; //Social Security Number
    private String name;
    private double salary;

    public Employee(int ssn, String name, double salary) {
        setSsn(ssn);
        setName(name);
        setSalary(salary);
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "ssn=" + ssn +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}