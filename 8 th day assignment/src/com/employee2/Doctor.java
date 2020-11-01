package com.employee2;
import  java.util.Scanner;

public class Doctor extends Employee{

    Scanner sc=new Scanner(System.in);
    String patient_name,treatment;
    double treatment_charge;



   public  void get_treatmentDetails()
   {


               System.out.println("******************************");
               System.out.println("Enter the patient name");
               patient_name = sc.next();
               sc.nextLine();
               System.out.println("Enter the treatment");
               treatment = sc.nextLine();
               System.out.println("Enter the Treatment Charge");
               treatment_charge = sc.nextDouble();
               System.out.println();
           }




   public void  display_treatmentDetails()
   {

       System.out.println("Patient Name:"+patient_name);
       System.out.println("Patient Treatment:"+treatment);
       System.out.println("Patient Treatment Charge:"+treatment_charge);
       System.out.println();
   }

}
