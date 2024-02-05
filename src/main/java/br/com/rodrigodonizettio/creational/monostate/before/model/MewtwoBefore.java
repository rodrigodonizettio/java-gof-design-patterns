package br.com.rodrigodonizettio.creational.monostate.before.model;

import br.com.rodrigodonizettio.creational.monostate.generic.model.Pokemon;

public class MewtwoBefore implements Pokemon {
    public MewtwoBefore() { }

    @Override
    public String speak() {
        return "Roaaarr!";
    }
}
