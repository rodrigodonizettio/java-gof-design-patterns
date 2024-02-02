package br.com.rodrigodonizettio.creational.singleton.before.model;

import br.com.rodrigodonizettio.creational.singleton.generic.model.Pokemon;

public class MewtwoBefore implements Pokemon {
    public MewtwoBefore() { }

    @Override
    public String speak() {
        return "Roaaarr!";
    }
}
