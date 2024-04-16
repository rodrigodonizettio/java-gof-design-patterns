package br.com.rodrigodonizettio.behavioral.mediator.model.human;

import br.com.rodrigodonizettio.behavioral.mediator.generic.model.Mediator;
import br.com.rodrigodonizettio.behavioral.mediator.model.pokemon.Pokemon;

import java.util.List;

public class Trainer1 {
    private List<Pokemon> pokemons;
    private Mediator mediator;

    public Trainer1(List<Pokemon> pokemons, Mediator mediator) {
        this.pokemons = pokemons;
        this.mediator = mediator;
    }

    public void invokePokemon() {
        mediator.notify(this);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
