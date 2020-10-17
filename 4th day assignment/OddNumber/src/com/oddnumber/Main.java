package com.oddnumber;


public class Main {

    public static void main(String[] args) {
        int[] number = new int[5];

        for (int i = 1; i < number.length; i += 2) {
            number[i] = i;
            System.out.print(number[i] + "  ");

        }
        System.out.println();
    }
}

