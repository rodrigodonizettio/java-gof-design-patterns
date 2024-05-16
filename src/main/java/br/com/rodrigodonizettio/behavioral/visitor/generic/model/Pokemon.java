package br.com.rodrigodonizettio.behavioral.visitor.generic.model;

import br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor.PokemonVisitor;
import br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor.Visitable;

public class Pokemon implements Visitable<PokemonVisitor> {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
