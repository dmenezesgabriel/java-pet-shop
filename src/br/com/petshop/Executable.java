package br.com.petshop;
import br.com.petshop.Animal;

public class Executable {

    static Animal cachorroA = new Animal();

    public static void main(String[] args) {
        cachorroA.name = "Bella";
        cachorroA.species = "Cahorro";
        cachorroA.race = "Beagle";
        cachorroA.coloring = "Marrom e Branco";
        cachorroA.age = 0.5;

        cachorroA.scheduleProcedure("02/09/2021", "Cortar as unhas");
    }
}