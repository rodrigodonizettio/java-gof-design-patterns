package br.com.rodrigodonizettio.behavioral.mediator.generic.controller;

import br.com.rodrigodonizettio.behavioral.mediator.generic.model.PokemonBattleMediator;
import br.com.rodrigodonizettio.behavioral.mediator.model.pokemon.Bulbasaur;
import br.com.rodrigodonizettio.behavioral.mediator.model.pokemon.Charmander;
import br.com.rodrigodonizettio.behavioral.mediator.model.human.Trainer1;
import br.com.rodrigodonizettio.behavioral.mediator.model.human.Trainer2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        PokemonBattleMediator pokemonBattleMediator = new PokemonBattleMediator();

        Trainer1 trainer1 = new Trainer1(List.of(new Bulbasaur()), pokemonBattleMediator);
        Trainer2 trainer2 = new Trainer2(List.of(new Charmander()), pokemonBattleMediator);
        trainer1.invokePokemon();
        trainer2.invokePokemon();
    }
}
