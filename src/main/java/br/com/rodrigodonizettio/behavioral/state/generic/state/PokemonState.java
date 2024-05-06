package br.com.rodrigodonizettio.behavioral.state.generic.state;

import br.com.rodrigodonizettio.behavioral.state.generic.model.Pokemon;

public interface PokemonState {
    void choose(Pokemon pokemon);
    void revive(Pokemon pokemon);
}
