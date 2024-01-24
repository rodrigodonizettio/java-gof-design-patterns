package br.com.rodrigodonizettio.creational.abstractfactory.generic.model.human;

import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Badge;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Pokemon;

import java.util.List;

public class GymTrainer {
    List<Pokemon> pokemons;
    Badge badge;

    public GymTrainer() { }

    public GymTrainer(List<Pokemon> pokemons, Badge badge) {
        this.pokemons = pokemons;
        this.badge = badge;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public Badge getBadge() {
        return badge;
    }
}
