package br.com.rodrigodonizettio.creational.factorymethod.generic.model;

public class Bulbasaur implements Pokemon {
    public Bulbasaur() { }

    @Override
    public String speak() {
        return "Bulba!";
    }
}
