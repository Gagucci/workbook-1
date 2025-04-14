package org.example;
import java.util.Scanner;

public class Calculator {

    public static void doCalculation() {
        String choice;
        float answer;
        float numOne, numTwo;

        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Calculator App!");

        System.out.println("Please enter your First Number");
        numOne = read.nextFloat();

        System.out.println("Please enter your Second Number");
        numTwo = read.nextFloat();

        System.out.println("Options:\nA - Addition\nS - Subtraction\nM - Multiplication\n D - Division");
        System.out.println("Select your calculation option.");
        choice = read.next();
        if (choice.equals("A")) {
            answer = numOne + numTwo;
            System.out.println("By adding these numbers you get : " + answer);
        } else if (choice.equals("S")) {
            answer = numOne - numTwo;
            System.out.println("By subtracting these numbers you get : " + answer);
        } else if (choice.equals("M")) {
            answer = numOne * numTwo;
            System.out.println("By multiplying these numbers you get : " + answer);
        } else if (choice.equals("D")) {
            answer = numOne / numTwo;
            System.out.println("By dividing these numbers you get : " + answer);
        } else {
            System.out.println("Invalid option selected");
        }
    }

}

