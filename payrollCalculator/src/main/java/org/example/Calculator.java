package org.example;
import java.util.Scanner;

public class Calculator {
    public static void promptCalculation() {
        String name;
        float hours;
        float payRate;
        float grossPay;

        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Pay Calculator App!");
        System.out.println("Please enter your Name");
        name = read.nextLine();

        System.out.println("Please enter your hours worked");
        hours = read.nextFloat();

        System.out.println("Please enter your pay rate");
        payRate = read.nextFloat();

        grossPay = hours * payRate;
        System.out.println("Hello " + name + ", your gross pay is: " + grossPay);

    }
}
