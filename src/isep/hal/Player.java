package isep.hal;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public Player() {
        pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    @Override
    public String toString() {
        return pokemons.toString();
    }

    private List<Pokemon> pokemons;

}
