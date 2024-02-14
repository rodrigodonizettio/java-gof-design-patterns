package br.com.rodrigodonizettio.structural.adapter.generic.model.machine;

import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.GreatBall;
import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.PokeBall;

public class ModernPokeCenterHealing implements LegacyPokeballSlot, ModernPokeballSlot {
    public ModernPokeCenterHealing() { }

    @Override
    public void healPokeBall(PokeBall pokeBall) {
        System.out.println("Pokemon " + pokeBall.getPokemonName() +  " was healed successfully by Modern Machine!");
    }

    @Override
    public void healGreatBall(GreatBall greatBall) {
        System.out.println("Pokemon " + greatBall.getPokemonName() +  " was healed successfully by Modern Machine!");
    }
}
