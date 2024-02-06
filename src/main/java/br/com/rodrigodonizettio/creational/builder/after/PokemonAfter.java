package br.com.rodrigodonizettio.creational.builder.after;

import java.util.List;

public class PokemonAfter {
    String name;
    List<String> moves;

    public PokemonAfter() { }

    public PokemonAfter setName(String name) {
        this.name = name;
        return this;
    }

    public PokemonAfter setMoves(List<String> moves) {
        this.moves = moves;
        return this;
    }

    public PokemonAfter build() {
        return this;
    }

    @Override
    public String toString() {
        return "PokemonAfter{" +
                "name='" + name + '\'' +
                ", moves=" + moves +
                '}';
    }
}
