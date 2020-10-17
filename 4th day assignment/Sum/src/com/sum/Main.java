package com.sum;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       int[] numbers=new int[5];
       int sum=0;
       for (int i=0;i<5;i++)
       {

           System.out.println("Enter the  number");
           numbers[i]= sc.nextInt();
           sum+=numbers[i];

       }
       System.out.println();
       System.out.print("Sum of the values" +" "+sum);
        }







    }

