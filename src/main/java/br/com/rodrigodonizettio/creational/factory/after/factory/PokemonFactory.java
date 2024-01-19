package br.com.rodrigodonizettio.creational.factory.after.factory;

import br.com.rodrigodonizettio.creational.factory.generic.model.Bulbasaur;
import br.com.rodrigodonizettio.creational.factory.generic.model.Type;
import br.com.rodrigodonizettio.creational.factory.generic.model.Charmander;
import br.com.rodrigodonizettio.creational.factory.generic.model.Pokemon;

public class PokemonFactory {
    public static Pokemon createPokemon(Type pokemonType) throws IllegalArgumentException {
        if(pokemonType == Type.FIRE) return new Charmander();
        else if(pokemonType == Type.GRASS) return new Bulbasaur();
        else throw new IllegalArgumentException("Invalid Pokemon Type");
    }
}
