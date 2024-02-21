package br.com.rodrigodonizettio.structural.decorator.model.move;

import java.util.List;

public class FlyingMoves implements Move {

    public FlyingMoves() {
    }

    @Override
    public List<String> canLearn() {
        return List.of("Gust", "Whirlwind");
    }
}
