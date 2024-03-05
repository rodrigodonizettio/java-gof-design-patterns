package br.com.rodrigodonizettio.structural.proxy.generic.controller;

import br.com.rodrigodonizettio.structural.proxy.after.PokeballInvoker;
import br.com.rodrigodonizettio.structural.proxy.after.TrainerAfter;
import br.com.rodrigodonizettio.structural.proxy.before.TrainerBefore;
import br.com.rodrigodonizettio.structural.proxy.generic.model.Pokeball;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Pokeball> pokeballs = List.of(
                new Pokeball("Bulbasaur", "TrainerBefore"),
                new Pokeball("Oddish", "TrainerBefore"),
                new Pokeball("Charmander", "TrainerAfter"),
                new Pokeball("Magmar", "TrainerAfter"));

        System.out.println("Before. Any Trainer can use any Trainer Pokemon");
        TrainerBefore trainerBefore = new TrainerBefore("TrainerBefore");
        trainerBefore.usePokeball(pokeballs);

        System.out.println("After. Trainers can use only their Pokemons");
        TrainerAfter trainerAfter = new TrainerAfter("TrainerAfter");
        PokeballInvoker pokeballInvoker = new PokeballInvoker();
        pokeballInvoker.usePokeball(trainerAfter.getName(), pokeballs);
    }
}
