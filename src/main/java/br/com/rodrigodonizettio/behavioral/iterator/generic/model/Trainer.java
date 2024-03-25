package br.com.rodrigodonizettio.behavioral.iterator.generic.model;

import java.util.Iterator;


public class Trainer implements Iterable<String> {
    private String[] pokemons;

    public Trainer(String[] pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public Iterator<String> iterator() {
        return new PokemonIterator(pokemons);
    }
}
