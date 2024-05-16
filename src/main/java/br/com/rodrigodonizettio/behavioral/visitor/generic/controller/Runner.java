package br.com.rodrigodonizettio.behavioral.visitor.generic.controller;

import br.com.rodrigodonizettio.behavioral.visitor.generic.model.Pokemon;
import br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor.MovesVisitor;

public class Runner {
    public static void main(String[] args) {
        MovesVisitor movesVisitor = new MovesVisitor();
        movesVisitor.visit(new Pokemon("Bulbasaur"));
    }
}
