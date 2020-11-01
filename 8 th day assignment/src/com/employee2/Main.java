package com.employee2;

public class Main {

    public static void main(String[] args) {

        Doctor[] doctors=new  Doctor[2];
        Engineer[] engineers=new Engineer[2];
        pilot[] pilots=new  pilot[2];

        for (int i=0;i<2;i++)
        {
            doctors[i]=new Doctor();
            engineers[i]=new Engineer();
            pilots[i]=new pilot();
            doctors[i].getDetails();


        }
        for(int i=0;i<2;i++)
        {
            doctors[i].displayDetails();
        }
        for(int i=0;i<2;i++)
        {

            doctors[i].get_treatmentDetails();
        }
        for(int i=0;i<2;i++)
        {
            doctors[i].display_treatmentDetails();
        }

        for(int i=0;i<2;i++)
        {
            engineers[i].getDetails();

        }
        for(int i=0;i<2;i++)
        {
            engineers[i].displayDetails();
        }
        for(int i=0;i<2;i++)
        {
            engineers[i].getDetails1();
        }
        for(int i=0;i<2;i++)
        {
            engineers[i].putDetails();
        }


        for(int i=0;i<2;i++)
        {
            pilots[i].getDetails();
        }

        for(int i=0;i<2;i++)
        {
            pilots[i].displayDetails();
        }
        for(int i=0;i<2;i++)
        {
            pilots[i].pilotSkills();
        }

    }




}
