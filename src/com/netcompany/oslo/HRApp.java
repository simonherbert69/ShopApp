package com.netcompany.oslo;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("HR App started");
        try {
            Employee e1 = new Employee(123456, "John Doe", 212345.6);
            System.out.println("E1 = " + e1);
            Department d1 = new Department();
            d1.addEmployee(e1);
            System.out.println("D1 = " + d1);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Expected exception " + ex.toString());
        }
        catch (Exception e) {
            System.out.println("Unexpected exception " + e.toString());
        }
    }
}

