package com.avenger;
import java.util.Scanner;
public class Avenger {
    Scanner sc=new Scanner(System.in);
    String name,weapon,planet;
    int age,power;

    public void getDetails()
    {
        System.out.println("Enter the name of the Avenger");
        name=sc.next();
        System.out.println("Enter the age the Avenger");
        age=sc.nextInt();
        System.out.println("Enter the weapon");
        weapon=sc.next();
        System.out.println("Enter the Planet");
        planet=sc.next();
        System.out.println("Enter the power");
        power=sc.nextInt();
        System.out.println();

    }
    public void displayDetails()
    {
        System.out.println("Avenger name is"+" "+name);
        System.out.println("avenger age is"+" "+age);
        System.out.println("name of the Weapon"+" "+weapon);
        System.out.println("name of the Planet"+" "+planet);
        System.out.println("the power is"+" "+power);
        System.out.println();
    }

}
