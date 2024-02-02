package br.com.rodrigodonizettio.creational.singleton.after;

import br.com.rodrigodonizettio.creational.singleton.generic.model.Pokemon;

public class MewtwoAfter implements Pokemon {
    private static MewtwoAfter mewtwo = new MewtwoAfter();

    private MewtwoAfter() { }

    @Override
    public String speak() {
        return "Roaaarr!";
    }

    public static MewtwoAfter getInstance() {
        return mewtwo;
    }
}
