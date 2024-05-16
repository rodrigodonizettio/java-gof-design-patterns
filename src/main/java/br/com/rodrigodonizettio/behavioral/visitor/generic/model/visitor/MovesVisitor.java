package br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor;

import br.com.rodrigodonizettio.behavioral.visitor.generic.model.Pokemon;

public class MovesVisitor implements PokemonVisitor {
    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Extending Pokemon " + pokemon.getName() + " capabilities through adding a new TM to it");
    }
}
