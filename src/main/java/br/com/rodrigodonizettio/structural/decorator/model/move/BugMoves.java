package br.com.rodrigodonizettio.structural.decorator.model.move;

import java.util.List;

public class BugMoves implements Move {

    public BugMoves() {
    }

    @Override
    public List<String> canLearn() {
        return List.of("String Shot");
    }
}
