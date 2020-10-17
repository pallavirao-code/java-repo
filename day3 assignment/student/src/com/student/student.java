package com.student;

import java.util.Scanner;

public class student {

     int mark1, mark2, mark3, mark4, mark5;
     int total, average;


    public void percentage() {
        Scanner sc = new Scanner(System.in);
        //System.out.println(" Enter the 5 subjects marks");
        System.out.println(" Enter first subject marks");
        mark1 = sc.nextInt();
        System.out.println(" Enter Second subject marks");
        mark2 = sc.nextInt();
        System.out.println(" Enter third subject marks");
        mark3 = sc.nextInt();
        System.out.println(" Enter fourth subject marks");
        mark4 = sc.nextInt();
        System.out.println(" Enter fifth subject marks");
        mark5 = sc.nextInt();
        System.out.println();
       total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5;

       // if (mark1 >= 35 && mark2 >= 35 && mark3 >= 35 && mark4 >= 35 && mark5 >= 35)


            if (average >= 70 )
                System.out.println("Your in A grade");

            else if (average >= 60)
                System.out.println("Your in B grade");

            else if (average >= 50)
                System.out.println("Your in c grade");

            else if(average>=35)
                System.out.println("Your Pass");
            else
                System.out.println("Your Fail");


    }



    public  void display()
    {

        System.out.println("Total\t" + total);
        System.out.println("Percentage\t" +  average +"%");
    }
}



