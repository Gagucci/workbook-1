package org.example;
import java.util.Scanner;

public class Calculator {
        static Scanner read = new Scanner(System.in);
        static String name;
        static float hours;
        static float payRate;
        static float grossPay;
    public static void promptCalculation() {

        System.out.println("Welcome to the Pay Calculator App!");
        System.out.println("Please enter your Name");
        name = read.nextLine();

        System.out.println("Please enter your hours worked these past 2 weeks");
        hours = read.nextFloat();

        System.out.println("Please enter your hourly pay rate");
        payRate = read.nextFloat();


    }

    public static void grossPay() {
        grossPay = hours * payRate;
        System.out.println("Hello " + name + ", your gross pay is: " + grossPay);

    }
}
