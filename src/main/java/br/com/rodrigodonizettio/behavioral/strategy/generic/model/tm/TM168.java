package br.com.rodrigodonizettio.behavioral.strategy.generic.model.tm;

import br.com.rodrigodonizettio.behavioral.strategy.generic.model.pokemon.Pokemon;

public class TM168 implements TM {
    private static final TM168 tm168 = new TM168();
    private final String attackName = "Solar Beam";

    private TM168() { }

    @Override
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " attacked with " + attackName + "!");
    }

    public static TM168 getInstance() {
        return tm168;
    }
}
