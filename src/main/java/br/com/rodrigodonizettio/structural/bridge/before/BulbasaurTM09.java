package br.com.rodrigodonizettio.structural.bridge.before;

import br.com.rodrigodonizettio.structural.bridge.before.machine.technical.TM09;
import br.com.rodrigodonizettio.structural.bridge.generic.model.Pokemon;

public class BulbasaurTM09 extends Pokemon {
    private TM09 tm09;

    public BulbasaurTM09(String pokemonName) {
        super(pokemonName);
        tm09 = new TM09();
    }

    @Override
    public String toString() {
        return "BulbasaurTM09{" +
                "tm09=" + tm09.getMoveName() +
                '}';
    }
}
