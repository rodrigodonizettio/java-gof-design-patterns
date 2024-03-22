package br.com.rodrigodonizettio.behavioral.command.generic.model.tm;

import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Pokemon;

public interface TM {
    void teachTm(Pokemon pokemon);
    void forgetTm(Pokemon pokemon);
}
