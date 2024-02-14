package br.com.rodrigodonizettio.structural.adapter.generic.model.machine;

import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.PokeBall;

public class LegacyPokeCenterHealing implements LegacyPokeballSlot {
    public LegacyPokeCenterHealing() { }

    @Override
    public void healPokeBall(PokeBall pokeBall) {
        System.out.println("Pokemon " + pokeBall.getPokemonName() +  " was healed successfully by Legacy Machine!");
    }
}
