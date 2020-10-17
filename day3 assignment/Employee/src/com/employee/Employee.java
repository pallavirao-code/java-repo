package com.employee;
import  java.util.Scanner;

public class Employee {
    Scanner scn=new Scanner(System.in);
    String name,month;
    int date,year,age;
    float salary=0.0f;
    float tax=0.0f;
    int current_year=2020;

    public void getDetails()
    {
        System.out.println("Enter the Name of the Employee");
        name=scn.nextLine();
        System.out.println("Enter date of birth");
        date=scn.nextInt();
        System.out.println("Enter month of birth");
        month=scn.next();
        System.out.println("Enter the year of birth");
        year=scn.nextInt();
        System.out.println("Enter the Salary");
        salary=scn.nextFloat();
        System.out.println();

    }
    public void calculateTax()
    {

        if(salary>=500000)
        {
            tax=salary*0.2f;
        }
        else if(salary>=400000)
        {
            tax=salary*0.15f;
        }
        else if(salary>=300000)
        {
            tax=salary*0.1f;
        }
        else if(salary>=200000)
        {
            tax=salary*0.05f;
        }
        else
        {
            tax=0;
        }



    }

    public void displayDetails()
    {
        age=current_year-year;
        System.out.println("The Name is" +" "+ name);
        System.out.println("Age is"+" "+ age);
        System.out.println("Annual Salary is" + " "+salary);
        System.out.println("Tax Amount is" +" "+ tax);
        System.out.println();
    }


}
