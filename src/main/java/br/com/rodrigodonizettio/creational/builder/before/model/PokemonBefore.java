package br.com.rodrigodonizettio.creational.builder.before.model;

import java.util.List;

public class PokemonBefore {
    String name;
    List<String> moves;

    public PokemonBefore() { }

    public PokemonBefore(String name) {
        this.name = name;
    }

    public PokemonBefore(List<String> moves) {
        this.moves = moves;
    }

    public PokemonBefore(String name, List<String> moves) {
        this.name = name;
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", moves=" + moves +
                '}';
    }
}
