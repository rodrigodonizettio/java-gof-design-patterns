package br.com.rodrigodonizettio.behavioral.observer.generic.model;

import java.util.List;

public class Trainer implements Observer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    @Override
    public void notifyPokemonHealed(String trainerName) {
        if(this.name.equals(trainerName)) {
                System.out.println("Dear Trainer " + name +
                ", your Pokemons were healed! Come to the Healing Machine to collect them!");
        }
    }

    public String getName() {
        return name;
    }
}
