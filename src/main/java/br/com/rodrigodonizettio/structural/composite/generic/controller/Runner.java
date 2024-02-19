package br.com.rodrigodonizettio.structural.composite.generic.controller;

import br.com.rodrigodonizettio.structural.composite.generic.model.Bulbasaur;
import br.com.rodrigodonizettio.structural.composite.generic.model.Ivysaur;
import br.com.rodrigodonizettio.structural.composite.generic.model.Pikachu;
import br.com.rodrigodonizettio.structural.composite.generic.model.Raichu;
import br.com.rodrigodonizettio.structural.composite.generic.model.Venusaur;
import br.com.rodrigodonizettio.structural.composite.generic.service.EvolutionChain;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        EvolutionChain bulbasaurEvolutions = new EvolutionChain(List.of(new Bulbasaur(), new Ivysaur(), new Venusaur()));
        System.out.println(bulbasaurEvolutions.speak());


        EvolutionChain pikachuEvolutions = new EvolutionChain(List.of(new Pikachu(), new Raichu()));
        System.out.println(pikachuEvolutions.speak());
    }
}
