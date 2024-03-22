package br.com.rodrigodonizettio.behavioral.command.generic.model.trainer;

import br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon.Pokemon;
import br.com.rodrigodonizettio.behavioral.command.generic.model.tm.TM;

import java.util.List;

public class Trainer {
    private List<Pokemon> pokemons;
    private List<TM> tms;

    public Trainer(List<Pokemon> pokemons, List<TM> tms) {
        this.pokemons = pokemons;
        this.tms = tms;
    }

    public void teachTMs() {
        pokemons.forEach(p -> tms.forEach(tm -> tm.teachTm(p)));
    }

    public void forgetTMs() {
        pokemons.forEach(p -> tms.forEach(tm -> tm.forgetTm(p)));
    }
}
