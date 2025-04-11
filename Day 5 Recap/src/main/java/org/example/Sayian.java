package org.example;

public class Saiyan {
    private String name;
    private int powerLevel;
    private int kiLevel;
    private boolean superSaiyan = false;

    public void displayInfo() {
        System.out.println("---Scouter Info---");
        System.out.println("Name: " + name);
        System.out.println("Power Level is: " + powerLevel);
        System.out.println("Ki level is: " + kiLevel);
        System.out.println("Is he a Super Saiyan: " + superSaiyan);
    }

    public Saiyan (String _name, int _powerLevel, int _kiLevel, boolean _superSayian) {
        this.name = _name;
        this.powerLevel = _powerLevel;
        this.kiLevel = _kiLevel;
        this.superSayian = _superSayian;
    }
}

