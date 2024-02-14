package br.com.rodrigodonizettio.structural.adapter.after;

import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.GreatBall;
import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.PokeBall;

public interface GreatBallToPokeBallAdapter {

    PokeBall adapt(GreatBall greatBall);
}
