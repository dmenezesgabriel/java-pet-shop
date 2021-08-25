package br.com.petshop;

public class Animal {
    // Properties
    String name;
    String species;
    String race;
    String coloring;
    int age;
    // Methods
    void scheduleProcedure(String date, String observation) {
        system.out.println(String.format("Pet %s agendou procedimento em %s com a observação %s.", name, date , observation))
    }

    void finishStay(String date, String observation) {
        system.out.println(String.format("Pet %s agendou procedimento em %s com a observação %s.", name, date , observation))
    }
}