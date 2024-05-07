package br.com.rodrigodonizettio.behavioral.strategy.generic.model.tm;

import br.com.rodrigodonizettio.behavioral.strategy.generic.model.pokemon.Pokemon;

public class TM111 implements TM {
    private static final TM111 tm111 = new TM111();
    private final String attackName = "Giga Drain";

    private TM111() { }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " attacked with " + attackName + "!");
    }

    public static TM111 getInstance() {
        return tm111;
    }
}
