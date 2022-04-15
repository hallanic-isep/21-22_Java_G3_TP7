package isep.hal;

import static isep.hal.Pokemon.*; // Permet d'écrire "TIPLOUF" et non "Pokemon.TIPLOUF"

public class Main {

    // Question 1
    public static void main(String[] args) {

        Player alex = new Player();
        Professor sorbier = new Professor(TIPLOUF, OUISTICRAM, TORTIPOUSS);

        System.out.println("alex:" + alex);
        System.out.println("sorbier:" + sorbier);

        Pokemon pokemon = sorbier.askForPokemon();
        alex.getPokemons().add(pokemon);

        System.out.println("alex:" + alex);
        System.out.println("sorbier:" + sorbier);
    }
}
