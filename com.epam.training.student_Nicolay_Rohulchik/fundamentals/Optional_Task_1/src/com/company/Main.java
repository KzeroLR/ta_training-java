package com.company;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            String NumbersLong = "", NumbersShort = line;
            for (String s : line.split(" ")) {
                if (s.length() > NumbersLong.length()) NumbersLong = s;
                if (s.length() < NumbersShort.length()) NumbersShort = s;
            }
            System.out.println("Самое длинное число: '" + NumbersLong + "'");
            System.out.println("Длина: " + NumbersLong.length());
            System.out.println("Самое короткое число: '" +NumbersShort + "'");
            System.out.println("Длина: " + NumbersShort.length());
        }
            }
