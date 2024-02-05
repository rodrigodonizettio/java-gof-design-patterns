package br.com.rodrigodonizettio.creational.monostate.after.model;

import br.com.rodrigodonizettio.creational.monostate.generic.model.Pokemon;

public class MewtwoAfter implements Pokemon {
    private static Pokemon mewtwo = new MewtwoAfter();

    public MewtwoAfter() { }

    @Override
    public String speak() {
        return "Roaaarr!";
    }

    public Pokemon getInstance() {
        return mewtwo;
    }
}
