package br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String name;
    private List<String> movesTypes;
    private List<String> moves = new ArrayList<>();

    public Pokemon(String name, List<String> movesTypes) {
        this.name = name;
        this.movesTypes = movesTypes;
    }

    public String getName() {
        return name;
    }

    public List<String> getType() {
        return movesTypes;
    }

    public List<String> getMoves() {
        return moves;
    }

    public void addMoves(List<String> moves) {
        this.moves.addAll(moves);
    }
}
