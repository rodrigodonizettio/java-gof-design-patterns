package br.com.rodrigodonizettio.behavioral.memento.generic.controller;

import br.com.rodrigodonizettio.behavioral.memento.generic.model.Pokemon;

import java.util.LinkedHashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Bulbasaur");
        Map<String, Pokemon.PokemonMemento> pokemonMoodHistory = new LinkedHashMap<>();

        pokemon.setMood("ANGRY");
        pokemonMoodHistory.put("SUNDAY", pokemon.saveMood());
        pokemon.setMood("CALM");
        pokemonMoodHistory.put("MONDAY", pokemon.saveMood());
        pokemon.setMood("HAPPY");
        pokemonMoodHistory.put("TUESDAY", pokemon.saveMood());

        pokemonMoodHistory.forEach((k, v) -> System.out.println("The Pokemon " + pokemon.getName()
                + " on " + k + " was in a(n) "
                + v.getMood() + " mood"));

        System.out.println("The last Pokemon mood was: " + pokemon.getMood());

        pokemon.restoreMood(pokemonMoodHistory.get("SUNDAY"));

        System.out.println("But after restoring the SUNDAY mood the new Pokemon mood is: " + pokemon.getMood());
    }
}
