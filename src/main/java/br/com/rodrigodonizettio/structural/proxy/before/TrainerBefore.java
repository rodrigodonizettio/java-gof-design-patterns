package br.com.rodrigodonizettio.structural.proxy.before;

import br.com.rodrigodonizettio.structural.proxy.generic.model.Pokeball;

import java.util.List;

public class TrainerBefore {
    private String name;

    public TrainerBefore(String name) {
        this.name = name;
    }


    public void usePokeball(List<Pokeball> pokeballs) {
        pokeballs.forEach(p -> System.out.println("Trainer '" + name
                + "' has invoked Pokemon '" + p.getPokemonName() + "'"
                + " that belongs to Trainer '" + p.getTrainerName() + "'"));
    }
}
