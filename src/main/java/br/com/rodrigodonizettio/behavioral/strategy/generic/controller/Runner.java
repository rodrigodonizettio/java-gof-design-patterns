package br.com.rodrigodonizettio.behavioral.strategy.generic.controller;

import br.com.rodrigodonizettio.behavioral.strategy.generic.model.pokemon.Pokemon;
import br.com.rodrigodonizettio.behavioral.strategy.generic.model.tm.TM111;
import br.com.rodrigodonizettio.behavioral.strategy.generic.model.tm.TM168;

public class Runner {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Bulbasaur");

        pokemon.attack(TM111.getInstance());
        pokemon.attack(TM168.getInstance());
    }
}
