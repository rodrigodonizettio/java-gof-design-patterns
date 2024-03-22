package br.com.rodrigodonizettio.behavioral.command.generic.model.tm;

import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Pokemon;

public class TM09 implements TM {
//    private Pokemon pokemon;
    private final String tmName = "Take Down";

//    public TM09(Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

    public String getTmName() {
        return tmName;
    }

    @Override
    public void teachTm(Pokemon pokemon) {
        pokemon.learnTm(tmName);
    }

    @Override
    public void forgetTm(Pokemon pokemon) {
        pokemon.forgetTm(tmName);
    }
}
