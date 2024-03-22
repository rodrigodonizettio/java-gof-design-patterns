package br.com.rodrigodonizettio.behavioral.command.generic.model.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Bulbasaur implements Pokemon {
    private final String name = "Bulbasaur";
    private List<String> moves = new ArrayList<>();

    public Bulbasaur() { }

    @Override
    public void learnTm(String tmName) {
        System.out.println(name + " is learning the TM " + tmName);
        moves.add(tmName);
    }

    @Override
    public void forgetTm(String tmName) {
        System.out.println(name + " is forgetting the TM " + tmName);
        moves.remove(tmName);
    }
}
