package com.employee2;
import  java.util.Scanner;

public class Engineer extends  Employee{

    Scanner sc=new Scanner(System.in);
    String  qualification,engineer_type,function;


    public void getDetails1()
    {

            System.out.println("**********************************");
            System.out.println("Enter Engineer Qualification ");
            qualification = sc.next();
            System.out.println("Enter the type of the Engineer");
            engineer_type = sc.next();
            System.out.println("Enter the function");
            function = sc.next();
            System.out.println();
        }


    public void putDetails()
    {
        System.out.println("Qualification:" +qualification);
        System.out.println("Engineer Type:" +engineer_type);
        System.out.println("Engineer Function:" +function);
        System.out.println();
    }
}
