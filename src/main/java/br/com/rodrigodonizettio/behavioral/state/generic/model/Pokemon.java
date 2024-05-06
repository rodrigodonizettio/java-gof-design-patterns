package br.com.rodrigodonizettio.behavioral.state.generic.model;

import br.com.rodrigodonizettio.behavioral.state.generic.state.AliveState;
import br.com.rodrigodonizettio.behavioral.state.generic.state.PokemonState;

public class Pokemon {
    private PokemonState state = AliveState.getInstance();

    public Pokemon() { }

    public void onChoosing() {
        System.out.println("Trying to choose the Pokemon to battle");
        state.choose(this);
    }

    public void onRevive() {
        System.out.println("Trying to revive the Pokemon");
        state.revive(this);
    }

    public PokemonState getState() {
        return state;
    }

    public void setState(PokemonState state) {
        this.state = state;
    }
}
