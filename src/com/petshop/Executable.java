package com.petshop;
import com.petshop.*;

public class Executable {

    static Animal dog = new Animal();

    public static void main(String[] args) {
        dog.name = "Bella";
        dog.species = "Cahorro";
        dog.race = "Beagle";
        dog.coloring = "Marrom e Branco";
        dog.age = 0.5;

        dog.scheduleProcedure("02/09/2021", "Cortar as unhas");
    }
}