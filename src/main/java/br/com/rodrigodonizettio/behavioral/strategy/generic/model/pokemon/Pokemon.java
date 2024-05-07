package br.com.rodrigodonizettio.behavioral.strategy.generic.model.pokemon;

import br.com.rodrigodonizettio.behavioral.strategy.generic.model.tm.TM;

public class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attack(TM tm) {
        tm.attack(this);
    }
}
