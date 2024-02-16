package br.com.rodrigodonizettio.structural.bridge.before;

import br.com.rodrigodonizettio.structural.bridge.before.machine.technical.TM22;
import br.com.rodrigodonizettio.structural.bridge.generic.model.Pokemon;

public class BulbasaurTM22 extends Pokemon {
    private TM22 tm22;

    public BulbasaurTM22(String pokemonName) {
        super(pokemonName);
        tm22 = new TM22();
    }

    @Override
    public String toString() {
        return "BulbasaurTM22{" +
                "tm22=" + tm22.getMoveName() +
                '}';
    }
}
