package br.com.rodrigodonizettio.structural.adapter.after;

import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.GreatBall;
import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.PokeBall;

public class Adapter implements GreatBallToPokeBallAdapter {
    public Adapter() { }

    @Override
    public PokeBall adapt(GreatBall greatBall) {
        return new PokeBall(greatBall.getPokemonName());
    }
}
