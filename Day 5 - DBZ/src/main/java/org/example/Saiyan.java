package org.example;

public class Saiyan {


    private String name;
    private int powerLevel;
    private int kiLevel;
    private boolean superSaiyan;



    public Saiyan (String _name, int _powerLevel, int _kiLevel) {
        this.name = _name;
        this.powerLevel = _powerLevel;
        this.kiLevel = _kiLevel;
        this.superSaiyan = false;
    }

    public void displayInfo() {
        System.out.println("---Scouter Info---");
        System.out.println("Name: " + name);
        System.out.println("Power Level is: " + powerLevel);
        System.out.println("Ki level is: " + kiLevel);
        System.out.println("Is he a Super Saiyan: " + superSaiyan);
    }

    public void trainingArc() {
        this.powerLevel = (powerLevel + 500);
        this.kiLevel = (kiLevel +  50);

        System.out.println(this.name + " has been training hard!");
        System.out.println("Their power level is " + this.powerLevel);
        System.out.println("Their ki level is " + this.kiLevel + "🔥");
    }

    public void isSuper() {
        this.superSaiyan = true;

        System.out.println("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        System.out.println("BOOM");
        System.out.println("Transform!");
    }

}
