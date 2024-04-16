package br.com.rodrigodonizettio.behavioral.mediator.model.pokemon;

public class Bulbasaur implements Pokemon {
    private final String name = "Bulbasaur";

    public Bulbasaur() { }

    @Override
    public String speak() {
        return "Bulba!";
    }

    public String getName() {
        return name;
    }
}
