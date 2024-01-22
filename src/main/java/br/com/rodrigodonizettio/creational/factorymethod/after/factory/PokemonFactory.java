package br.com.rodrigodonizettio.creational.factorymethod.after.factory;

import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Bulbasaur;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Type;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Charmander;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Pokemon;

public class PokemonFactory {
    public static Pokemon createPokemon(Type pokemonType) throws IllegalArgumentException {
        if(pokemonType == Type.FIRE) return new Charmander();
        else if(pokemonType == Type.GRASS) return new Bulbasaur();
        else throw new IllegalArgumentException("Invalid Pokemon Type");
    }
}
