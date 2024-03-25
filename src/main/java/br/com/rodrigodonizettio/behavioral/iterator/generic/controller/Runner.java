package br.com.rodrigodonizettio.behavioral.iterator.generic.controller;

import br.com.rodrigodonizettio.behavioral.iterator.generic.model.Trainer;


public class Runner {
    public static void main(String[] args) {
        String[] pokemons = {"Bulbasaur", "Charmander", "Squirtle", "Pikachu"};
        Trainer trainer = new Trainer(pokemons);

        trainer.forEach(p -> System.out.println("Go " + p + " !"));
    }
}
