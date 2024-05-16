package br.com.rodrigodonizettio.behavioral.visitor.generic.model.visitor;

public interface Visitable<V> {
    void accept(V pokemonVisitor);
}
