package org.example;
import org.example.Saiyan;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Saiyan mySaiyan = new Saiyan("Goku", 9001, 10000, true);
        Saiyan badSaiyan = new Saiyan("Yoku", 5000, 6000, false);

        mySaiyan.displayInfo();
        badSaiyan.displayInfo();

    }
}