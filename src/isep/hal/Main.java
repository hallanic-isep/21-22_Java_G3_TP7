package isep.hal;

import java.util.Random;

import static isep.hal.Pokemon.*; // Permet d'écrire "TIPLOUF" et non "Pokemon.TIPLOUF"

public class Main {

    // Question 1
    public static void main(String[] args) {

        Player alex = new Player();
        // On utilise une static factory à la place : Professor sorbier = new Professor(TIPLOUF, OUISTICRAM, TORTIPOUSS);
        Professor sorbier = Professor.createProfessorSorbier();

        System.out.println("alex:" + alex);
        System.out.println("sorbier:" + sorbier);

        // Question 2...
        Random random = new Random();
        int index = random.nextInt( sorbier.getPokemons().size() );
        sorbier.getPokemons().remove( index );
        // ... Question 2

        Pokemon pokemon = sorbier.askForPokemon();
        alex.getPokemons().add(pokemon);

        System.out.println("alex:" + alex);
        System.out.println("sorbier:" + sorbier);
    }
}
