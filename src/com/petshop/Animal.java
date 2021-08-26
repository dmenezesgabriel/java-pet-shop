package com.petshop;

public class Animal {
    // Properties
    private String name;
    private String species;
    private String race;
    private String coloring;
    private double age;

    // Constructors or initialization methods
    public Animal(String name, String species, String race, String coloring, double age) {
        this.name = name;
        this.species = species;
        this.race = race;
        this.coloring = coloring;
        this.age = age;
    }

    // Methods
    void scheduleProcedure(String date, String observation) {
        System.out.println(String.format("Pet %s scheduled procedure at %s with description: %s.", name, date , observation));
    }

    void finishStay(String date, String observation) {
        System.out.println(String.format("Pet %s scheduled procedure at %s with description: %s.", name, date , observation));
    }
}