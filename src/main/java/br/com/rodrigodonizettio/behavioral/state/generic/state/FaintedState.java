package br.com.rodrigodonizettio.behavioral.state.generic.state;

import br.com.rodrigodonizettio.behavioral.state.generic.model.Pokemon;

public class FaintedState implements PokemonState {
    private final static FaintedState state = new FaintedState();

    private FaintedState() { }

    @Override
    public void choose(Pokemon pokemon) {
        System.out.println("Pokemon is Fainted and cannot battle!");
    }

    @Override
    public void revive(Pokemon pokemon) {
        pokemon.setState(AliveState.getInstance());
        System.out.println("Pokemon was revived!");
    }

    public static FaintedState getInstance() {
        return state;
    }
}
