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

    public void compareStrength(Saiyan _enemy) {
        int highestNum = Math.max(this.powerLevel, _enemy.powerLevel);
        if (this.powerLevel != highestNum) {
            System.out.println(_enemy.name + " Is stronger than you with a power level of " + _enemy.powerLevel);
        } else {
            System.out.println(this.name + ", you are the strongest with a power level of " + this.powerLevel);
        }
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

    public void transform() {
        if (powerLevel >= 9000) {
            System.out.println("Your power level is over 9000!\nYour time has come!");
            System.out.println("AHHHHHHHHHHHHHHHHHHHHHHH!\nYou are now a Super Saiyan!");
            this.superSaiyan = true;
            this.powerLevel = (powerLevel * 2);
            this.kiLevel = (kiLevel * 2);
            System.out.println("Your power level is now " + this.powerLevel);
            System.out.println("Your ki level is now " + this.kiLevel);
        } else {
            System.out.println("You need to train harder!");
            System.out.println("Your power level is not high enough to transform!");
        }
    }

    public void blast(Saiyan _enemy) {
        if (kiLevel >= 30) {
            System.out.println("You have blasted " + _enemy.name + "!");
            System.out.println("Your ki level is now " + (kiLevel - 30));
            this.kiLevel = (kiLevel - 30);
            System.out.println(_enemy.name + " has been blasted!");
            System.out.println("Their power level is now " + (_enemy.powerLevel - 100));
            _enemy.powerLevel = (_enemy.powerLevel - 100);
        } else {
            System.out.println("You don't have enough ki to blast!");
        }
    }

}
