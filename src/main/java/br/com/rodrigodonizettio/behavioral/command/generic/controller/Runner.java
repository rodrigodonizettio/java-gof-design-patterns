package br.com.rodrigodonizettio.behavioral.command.generic.controller;

import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Bulbasaur;
import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Charmander;
import br.com.rodrigodonizettio.behavioral.command.generic.model.tm.TM09;
import br.com.rodrigodonizettio.behavioral.command.generic.model.tm.TM17;
import br.com.rodrigodonizettio.behavioral.command.generic.model.trainer.Trainer;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer(List.of(new Bulbasaur(), new Charmander()), List.of(new TM09(), new TM17()));
        trainer.teachTMs();
        trainer.forgetTMs();
    }
}
