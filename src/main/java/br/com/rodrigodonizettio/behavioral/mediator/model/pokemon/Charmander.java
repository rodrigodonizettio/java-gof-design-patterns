package br.com.rodrigodonizettio.behavioral.mediator.model.pokemon;

public class Charmander implements Pokemon {
    private final String name = "Charmander";

    public Charmander() { }

    @Override
    public String speak() {
        return "Charrr!";
    }

    public String getName() {
        return name;
    }
}
