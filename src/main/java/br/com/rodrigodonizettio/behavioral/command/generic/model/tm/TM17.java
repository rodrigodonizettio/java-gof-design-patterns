package br.com.rodrigodonizettio.behavioral.command.generic.model.tm;

import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Pokemon;

public class TM17 implements TM {
//    private Pokemon pokemon;
    private final String tmName = "Protect";

//    public TM17(Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    @Override
    public void teachTm(Pokemon pokemon) {
        pokemon.learnTm(tmName);
    }

    @Override
    public void forgetTm(Pokemon pokemon) {
        pokemon.forgetTm(tmName);
    }
}
