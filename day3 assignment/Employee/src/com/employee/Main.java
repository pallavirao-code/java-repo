package com.employee;

public class Main {

    public static void main(String[] args) {
	Employee[] employees=new Employee[2];
	  for (int i=0;i<2;i++)
      {
          employees[i]=new Employee();
          employees[i].getDetails();
      }
        for (int i=0;i<2;i++)
        {

            employees[i].calculateTax();
        }
        for (int i=0;i<2;i++)
        {

            employees[i].displayDetails();
        }

    }
}
