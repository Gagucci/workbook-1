package org.example;
import java.util.Scanner;
public class CarRental {

    static Scanner read = new Scanner(System.in);
    static String pickupDate;
    static String eTag;
    static String gps;
    static String roadside;

    static int age;
    static int rentalDuration;

    static double basePrice = 29.99;
    static double eTagPrice = 3.95;
    static double gpsPrice = 2.95;
    static double roadsidePrice = 3.95;
    static double underAgeSurcharge = .30;
    static double optionsCost;
    static double totalPrice;

    public static void rentalPrompt() {

        System.out.println("Welcome to KG Rentals!\nPlease enter your intended pickup date! (MM/DD/YYYY) ");
        pickupDate = read.nextLine();
        System.out.println("You wish to pick up on " + pickupDate + ", sounds good!\nNow please enter how many days you wish to rent the car.");
        rentalDuration = read.nextInt();
        System.out.println("Great! Now please enter your age.");
        age = read.nextInt();
        read.nextLine();
        System.out.println("Would you like to add an eTag to your rental?\nChoices:\nYes / No");
        eTag = read.nextLine();
        System.out.println("Would you like to add a GPS to your rental?\nChoices:\nYes / No");
        gps = read.nextLine();
        System.out.println("Would you like to add roadside assistance to your rental?\nChoices:\nYes / No");
        roadside = read.nextLine();

    }
    public static void calculateOptions() {

//        Old if statements
//        if (eTag.equals("Yes")) {
//            optionsCost = optionsCost + eTagPrice;
//            System.out.println("We've added an eTag to your rental!");
//        } else if (eTag.equals("No")) {
//            System.out.println("No worries!");
//        }
//
//        if (gps.equals("Yes")) {
//            optionsCost = optionsCost + gpsPrice;
//            System.out.println("We've added a GPS to your rental!");
//        } else if (gps.equals("No")) {
//            System.out.println("No worries!");
//        }
//
//        if (roadside.equals("Yes")) {
//            optionsCost = optionsCost + roadsidePrice;
//            System.out.println("We've added roadside assistance to your rental!");
//        } else if (roadside.equals("No")) {
//            System.out.println("No worries!");
//        }

        switch (eTag){
            case "Yes":
                optionsCost = optionsCost + eTagPrice;
                System.out.println("We've added an eTag to your rental!");
                break;
            case "No":
                System.out.println("No worries!");
                break;
        }

        switch (gps){
            case "Yes":
                optionsCost = optionsCost + gpsPrice;
                System.out.println("We've added a GPS to your rental!");
                break;
            case "No":
                System.out.println("No worries!");
                break;
        }

        switch (roadside){
            case "Yes":
                optionsCost = optionsCost + roadsidePrice;
                System.out.println("We've added roadside assistance to your rental!");
                break;
            case "No":
                System.out.println("No worries!");
                break;
        }


    }

    public static void calculateRental() {
        if (age < 25) {
            totalPrice = ((basePrice + optionsCost) * rentalDuration) + ((basePrice + optionsCost) * underAgeSurcharge);
            double formattedPrice = Math.round(totalPrice * 100.0) / 100.0;
            System.out.println("As you are under 25, you will be charged an additional 30% surcharge.\nYour total is: $" + formattedPrice);
        } else {
            totalPrice = (basePrice + optionsCost) * rentalDuration;
            double formattedPrice = Math.round(totalPrice * 100.0) / 100.0;
            System.out.println("Your total is: $" + formattedPrice);
        }

    }
}
