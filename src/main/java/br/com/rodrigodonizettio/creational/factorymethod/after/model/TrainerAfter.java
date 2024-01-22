package br.com.rodrigodonizettio.creational.factorymethod.after.model;

import br.com.rodrigodonizettio.creational.factorymethod.after.factory.PokemonFactory;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Type;
import br.com.rodrigodonizettio.creational.factorymethod.generic.model.Pokemon;

public class TrainerAfter {
    Pokemon firstPokemon;

    public TrainerAfter(Type pokemonType) {
        firstPokemon = PokemonFactory.createPokemon(pokemonType);
    }

    public Pokemon getPokemon() {
        return firstPokemon;
    }
}
