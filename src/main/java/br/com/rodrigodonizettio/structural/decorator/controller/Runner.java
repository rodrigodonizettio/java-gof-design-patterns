package br.com.rodrigodonizettio.structural.decorator.controller;

import br.com.rodrigodonizettio.structural.decorator.model.BasePokemon;
import br.com.rodrigodonizettio.structural.decorator.model.move.BugMoves;
import br.com.rodrigodonizettio.structural.decorator.model.move.FlyingMoves;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // The behaviour of "Composite" and "Decorator" are quite the same, but "Composite" is structured for Chain/Tree type like component

        BasePokemon caterpie = new BasePokemon("Caterpie", List.of(new BugMoves()));
        System.out.println("Pokemon " + caterpie.getName() + " can learn the following moves: ");
        caterpie.canLearn().forEach(System.out::println);

        BasePokemon butterfree = new BasePokemon("Butterfree", List.of(new BugMoves(), new FlyingMoves()));
        System.out.println("Pokemon " + butterfree.getName() + " can learn the following moves: ");
        butterfree.canLearn().forEach(System.out::println);
    }
}
