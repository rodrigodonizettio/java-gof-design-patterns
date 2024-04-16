package br.com.rodrigodonizettio.behavioral.mediator.generic.model;

import br.com.rodrigodonizettio.behavioral.mediator.model.pokemon.Bulbasaur;
import br.com.rodrigodonizettio.behavioral.mediator.model.pokemon.Pokemon;
import br.com.rodrigodonizettio.behavioral.mediator.model.human.Trainer1;
import br.com.rodrigodonizettio.behavioral.mediator.model.human.Trainer2;

public class PokemonBattleMediator implements Mediator {
    @Override
    public void notify(Object sender) {
        if(sender instanceof Trainer1) {
            performTrainer1Action(sender);
        } else if(sender instanceof Trainer2) {
            performTrainer2Action(sender);
        } else performAnyTrainerAction(sender);
    }

    private void performTrainer1Action(Object sender) {
        Pokemon pokemon = ((Trainer1) sender).getPokemons().get(0);
        System.out.println("Trainer 1 has invoked the Pokemon through Mediator: " + pokemon.getName() + "! " + pokemon.speak());
    }

    private void performTrainer2Action(Object sender) {
        Pokemon pokemon = ((Trainer2) sender).getPokemons().get(0);
        System.out.println("Trainer 2 has invoke the Pokemon through Mediator: " + pokemon.getName() + "! " + pokemon.speak());
    }

    private void performAnyTrainerAction(Object sender) {
        System.out.println("Other action should result another result");
    }
}
