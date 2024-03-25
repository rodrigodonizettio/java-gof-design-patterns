package br.com.rodrigodonizettio.behavioral.iterator.generic.model;

import java.util.Iterator;

public class PokemonIterator implements Iterator {
    private final String[] pokemons;
    private int index = 0;

    public PokemonIterator(String[] pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public boolean hasNext() {
        try {
            if(null == pokemons) return false;
            return null != pokemons[index];
        } catch (IndexOutOfBoundsException ioobe) {
            return false;
        }
    }

    @Override
    public Object next() {
        String pokemonName = pokemons[index];
        index++;
        return pokemonName;
    }
}
