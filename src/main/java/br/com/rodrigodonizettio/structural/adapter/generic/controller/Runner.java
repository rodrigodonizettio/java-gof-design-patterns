package br.com.rodrigodonizettio.structural.adapter.generic.controller;

import br.com.rodrigodonizettio.structural.adapter.after.Adapter;
import br.com.rodrigodonizettio.structural.adapter.generic.model.machine.LegacyPokeCenterHealing;
import br.com.rodrigodonizettio.structural.adapter.generic.model.machine.ModernPokeCenterHealing;
import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.GreatBall;
import br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball.PokeBall;

public class Runner {
    public static void main(String[] args) {
        LegacyPokeCenterHealing legacyPokeCenterHealing = new LegacyPokeCenterHealing();
        ModernPokeCenterHealing modernPokeCenterHealing = new ModernPokeCenterHealing();

        PokeBall pokeBall = new PokeBall("Bulbasaur");
        GreatBall greatBall = new GreatBall("Charmeleon");

        System.out.println("Before Adapter, only Modern Machine could heal GreatBall");
        legacyPokeCenterHealing.healPokeBall(pokeBall);
        // legacyPokeCenterHealing.healGreatBall(greatBall); // Broken line because Legacy machines can't heal GreatBall
        modernPokeCenterHealing.healGreatBall(greatBall);

        System.out.println("After Adapter, both Legacy and Modern Machines can now heal GreatBall");
        Adapter adapter = new Adapter();
        legacyPokeCenterHealing.healPokeBall(pokeBall);
        legacyPokeCenterHealing.healPokeBall(adapter.adapt(greatBall));
        modernPokeCenterHealing.healGreatBall(greatBall);
    }
}
