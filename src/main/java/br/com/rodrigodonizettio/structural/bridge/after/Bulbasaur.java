package br.com.rodrigodonizettio.structural.bridge.after;

import br.com.rodrigodonizettio.structural.bridge.after.machine.technical.TM;
import br.com.rodrigodonizettio.structural.bridge.generic.model.Pokemon;


public class Bulbasaur extends Pokemon {
    private TM tm;

    public Bulbasaur(String pokemonName, TM tm) {
        super(pokemonName);
        this.tm = tm;
    }

    @Override
    public String toString() {
        return "Bulbasaur{" +
                "tm=" + tm.describe() +
                '}';
    }
}
