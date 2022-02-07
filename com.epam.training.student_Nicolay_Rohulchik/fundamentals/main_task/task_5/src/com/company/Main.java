package com.company;

import java.util.Scanner;

public class Main {

    public static void main(int f) {

        String[] months = new String[13];
        months[1] = "jan";
        months[2] = "feb";
        months[3] = "mar";
        months[4] = "apr";
        months[5] = "may";
        months[6] = "jun";
        months[7] = "jul";
        months[8] = "avg";
        months[9] = "sep";
        months[10] = "okt";
        months[11] = "now";
        months[12] = "dec";
        String s;
        try {
            s = months[f];
            System.out.println(" " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        main(n);
    }

}
