package br.com.rodrigodonizettio.structural.composite.controller;

import br.com.rodrigodonizettio.structural.composite.model.Bulbasaur;
import br.com.rodrigodonizettio.structural.composite.model.Ivysaur;
import br.com.rodrigodonizettio.structural.composite.model.Pikachu;
import br.com.rodrigodonizettio.structural.composite.model.Raichu;
import br.com.rodrigodonizettio.structural.composite.model.Venusaur;
import br.com.rodrigodonizettio.structural.composite.service.EvolutionChain;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EvolutionChain bulbasaurEvolutions = new EvolutionChain(List.of(new Bulbasaur(), new Ivysaur(), new Venusaur()));
        System.out.println(bulbasaurEvolutions.speak());

        EvolutionChain pikachuEvolutions = new EvolutionChain(List.of(new Pikachu(), new Raichu()));
        System.out.println(pikachuEvolutions.speak());
    }
}
