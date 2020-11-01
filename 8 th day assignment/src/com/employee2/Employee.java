package com.employee2;
import java.util.Scanner;

public class Employee {

    Scanner sc=new Scanner(System.in);
    String name,Designation,designation;
    int age;
    double Salary;


    public void getDetails()
    {
        System.out.println("Enter the Name of the Employee");
        name=sc.next();
        System.out.println("Enter  the Age");
        age=sc.nextInt();
        System.out.println("Enter the Designation");
        Designation=sc.next();
        System.out.println("Enter the Salary");
        Salary=sc.nextDouble();
        System.out.println();
    }

    public void displayDetails()
    {
        System.out.println("Employee name:" +name);
        System.out.println("Employee age:" +age);
        System.out.println("Designation of the Employee:" +Designation);
        System.out.println("Employee Salary:" +Salary);
        System.out.println();
    }
}
