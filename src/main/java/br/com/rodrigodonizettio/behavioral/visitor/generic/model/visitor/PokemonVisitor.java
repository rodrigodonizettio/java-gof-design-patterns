package br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor;

import br.com.rodrigodonizettio.behavioral.visitor.generic.model.Pokemon;

public interface PokemonVisitor {
    void visit(Pokemon pokemon);
}
