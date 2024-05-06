package br.com.rodrigodonizettio.behavioral.state.generic.controller;

import br.com.rodrigodonizettio.behavioral.state.generic.model.Pokemon;
import br.com.rodrigodonizettio.behavioral.state.generic.state.FaintedState;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Pokemon is Healthy!");
        Pokemon pokemon = new Pokemon();
        pokemon.onChoosing();
        pokemon.onRevive();

        System.out.println("After long battles the Pokemon got Fainted!");
        pokemon.setState(FaintedState.getInstance());

        pokemon.onChoosing();
        pokemon.onRevive();
        pokemon.onChoosing();
    }
}
