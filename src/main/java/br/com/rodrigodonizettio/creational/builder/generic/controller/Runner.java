package br.com.rodrigodonizettio.creational.builder.generic.controller;

import br.com.rodrigodonizettio.creational.builder.after.PokemonAfter;
import br.com.rodrigodonizettio.creational.builder.before.model.PokemonBefore;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        PokemonBefore pokemonBeforeWithNoAttribute = new PokemonBefore();
        System.out.println("Pokemon Before with no-attributes: " + pokemonBeforeWithNoAttribute);
        PokemonBefore pokemonBeforeWithName = new PokemonBefore("Bulbasaur");
        System.out.println("Pokemon Before with name: " + pokemonBeforeWithName);
        PokemonBefore pokemonBeforeWithMoves = new PokemonBefore(List.of("Scratch", "Tackle"));
        System.out.println("Pokemon Before with moves: " + pokemonBeforeWithMoves);
        PokemonBefore pokemonBeforeWithNameAndMoves = new PokemonBefore("Bulbasaur", List.of("Vine Whip ", "Razor Leaf"));
        System.out.println("Pokemon Before with name and moves: " + pokemonBeforeWithNameAndMoves);

        // Also applying the Fluent Interface concept
        PokemonAfter pokemonAfterWithNoAttribute = new PokemonAfter().build();
        System.out.println("Pokemon After with no-attributes: " + pokemonAfterWithNoAttribute);
        PokemonAfter pokemonAfterWithName = new PokemonAfter().setName("Charmander").build();
        System.out.println("Pokemon After with name: " + pokemonAfterWithName);
        PokemonAfter pokemonAfterWithMoves = new PokemonAfter().setMoves(List.of("Scratch", "Tackle")).build();
        System.out.println("Pokemon After with moves: " + pokemonAfterWithMoves);
        PokemonAfter pokemonAfterWithNameAndMoves = new PokemonAfter().setName("Charmander").setMoves(List.of("Ember", "Fire Fang")).build();
        System.out.println("Pokemon After with name and moves: " + pokemonAfterWithNameAndMoves);
    }
}
