package org.example;
import java.util.Scanner;

public class SandwichTransaction {

    static Scanner read = new Scanner(System.in);
    static String name;
    static String foodName;
    static String reg = "Regular Joe";
    static String lrg = "Large Joe";
    static String isLoaded;

    static int age;
    static double regSandwich = 5.45;
    static double lrgSandwich = 8.95;
    static double order;
    static double total;

    public static void greetCustomer() {
        System.out.println("Welcome to Mo's Sloppy Joe's!\nWhat's your name fella?");
        name = read.nextLine();
        System.out.println("And how old are you, " + name);
        age = read.nextInt();
        read.nextLine();
    }

    public static void promptOrder() {
        System.out.println("Glad to have you " + name + "!\nWhat will your order be? Please enter a number.");
        System.out.println("Menu:\n --Sandwiches--\n1- Regular Joe\n2 - Large Joe");
        order = read.nextDouble();
        read.nextLine();
        if (order == 1) {
            order = regSandwich;
            foodName = reg;
            System.out.println("A regular joe? Sounds good!");
        } else if (order == 2) {
            order = lrgSandwich;
            foodName = lrg;
            System.out.println("A large joe? Okay big back!");
        }
    }

    public static void loadedCalculator() {
        System.out.println("Would you like your " + foodName + " loaded?\nChoices:\nYes / No");
        isLoaded = read.nextLine();
        if (isLoaded.equals("Yes") && order == regSandwich){
            order = order + 1.0;
        } else if (isLoaded.equals("Yes") && order == lrgSandwich) {
            order = order + 1.75;
        } else if (isLoaded.equals("No")) {
            System.out.println("No worries!");
        }
    }

    public static void calculateTotal() {
        if (age <= 17) {
            total = ( order - (order * .10) );
            System.out.println("You get a 10% discount kiddo!");
        } else if (age >= 65) {
            total = ( order - (order * .20) );
            System.out.println("You get a 20% discount, you old geezer!");
        } else {
            System.out.println("No discount for you, tough luck!");
        }

        String formattedTotal = String.format("%.2f", total);
        System.out.println("Alrighty " + name + ",\nyou ordered a " + foodName + "\nyour total will be " + formattedTotal );
        System.out.println("Have a great day!");
    }

}
