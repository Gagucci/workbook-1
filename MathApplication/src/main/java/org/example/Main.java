package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int bobSalary = 10000;
        int garySalary = 20000;

        int higherSalary = Math.max(bobSalary, garySalary);

        System.out.println("the answer is " + higherSalary);

        int carPrice = 50000;
        int truckPrice = 10000;

        int bestDeal = Math.min(carPrice, truckPrice);
        System.out.println("the best deal is " + bestDeal);

        double randomNumber = Math.random();
        System.out.println("the random number is " + randomNumber);

    }
}
