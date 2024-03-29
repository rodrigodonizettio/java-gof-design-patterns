package br.com.rodrigodonizettio.creational.factorymethod.before.model;

import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Bulbasaur;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Type;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Charmander;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Pokemon;

public class TrainerBefore {
    Pokemon firstPokemon;

    public TrainerBefore(Type pokemonType) {
        if(pokemonType == Type.FIRE) firstPokemon = new Charmander();
        else if(pokemonType == Type.GRASS) firstPokemon = new Bulbasaur();
        else throw new IllegalArgumentException("Invalid Pokemon Type");
    }

    public Pokemon getPokemon() {
        return firstPokemon;
    }
}
