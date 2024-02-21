package br.com.rodrigodonizettio.structural.decorator.model;

import br.com.rodrigodonizettio.structural.decorator.model.move.Move;

import java.util.ArrayList;
import java.util.List;


public class BasePokemon implements Move {
    private String name;
    private List<Move> moves;

    public BasePokemon(String name, List<Move> moves) {
        this.name = name;
        this.moves = moves;
    }

    @Override
    public List<String> canLearn() {
        List<String> movesString = new ArrayList<>();
        moves.forEach(moves -> movesString.addAll(moves.canLearn()));
        return movesString;
    }

    public String getName() {
        return name;
    }
}
