package com.petshop;
import com.petshop.Animal;

public class Main {

    static Animal dog = new Animal("Bella", "Dog", "Beagle", "Brown", 0.5);

    public static void main(String[] args) {
        dog.scheduleProcedure("02/09/21", "Cut nails");
        dog.finishStay("03/09/21", "Cut hair");
    }
}