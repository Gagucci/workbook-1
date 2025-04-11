package org.example;

public class Main {
    public static void main(String[] args) {

        Saiyan mySaiyan = new Saiyan("Goku", 9001, 10000);
        Saiyan badSaiyan = new Saiyan("Yoku", 5000, 6000);


        mySaiyan.displayInfo();

        mySaiyan.trainingArc();

        mySaiyan.isSuper();

    }
}