package com.company;

import java.util.Scanner;

public class Main {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String line = scan.nextLine();
                String longNmb = "", shortNmb = line;
                for (String s : line.split(" ")) {
                    if (s.length() > longNmb.length()) longNmb = s;
                    if (s.length() < shortNmb.length()) shortNmb = s;
                }
                System.out.println("Самое длинное число: '" + longNmb + "'");
                System.out.println("Длина: " + longNmb.length());
                System.out.println("Самое короткое число: '" + shortNmb + "'");
                System.out.println("Длина: " + shortNmb.length());
    }
}
