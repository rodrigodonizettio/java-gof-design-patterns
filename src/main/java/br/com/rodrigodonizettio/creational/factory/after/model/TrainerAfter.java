package br.com.rodrigodonizettio.creational.factory.after.model;

import br.com.rodrigodonizettio.creational.factory.after.factory.PokemonFactory;
import br.com.rodrigodonizettio.creational.factory.generic.model.Type;
import br.com.rodrigodonizettio.creational.factory.generic.model.Pokemon;

public class TrainerAfter {
    Pokemon firstPokemon;

    public TrainerAfter(Type pokemonType) {
        firstPokemon = PokemonFactory.createPokemon(pokemonType);
    }

    public Pokemon getPokemon() {
        return firstPokemon;
    }
}
