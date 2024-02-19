package br.com.rodrigodonizettio.structural.composite.generic.service;

import br.com.rodrigodonizettio.structural.composite.generic.model.Pokemon;

import java.util.List;

public class EvolutionChain implements Pokemon {
    private List<Pokemon> pokemons;

    public EvolutionChain(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String speak() {
        pokemons.forEach(p -> System.out.println("Hearing sounds from " + p.getClass().getSimpleName() + ": " + p.speak()));
        return "End of Evolutions for " + pokemons.get(0).getClass().getSimpleName() + "!";
    }
}
