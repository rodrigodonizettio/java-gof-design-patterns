package br.com.rodrigodonizettio.behavioral.state.generic.state;

import br.com.rodrigodonizettio.behavioral.state.generic.model.Pokemon;

public class AliveState implements PokemonState {
    private final static AliveState state = new AliveState();

    private AliveState() { }

    @Override
    public void choose(Pokemon pokemon) {
        if(pokemon.getState() instanceof AliveState) {
            System.out.println("Pokemon launched to battle!");
        } else System.out.println("Pokemon is Fainted and cannot battle!");
    }

    @Override
    public void revive(Pokemon pokemon) {
        System.out.println("Pokemon doesn't need to be revived because it's already Alive!");
    }

    public static AliveState getInstance() {
        return state;
    }
}
