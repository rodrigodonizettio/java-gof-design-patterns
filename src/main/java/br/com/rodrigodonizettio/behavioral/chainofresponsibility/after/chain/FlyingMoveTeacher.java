package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class FlyingMoveTeacher implements MoveTeacher {
    private MoveTeacher nextMoveTeacher;

    public FlyingMoveTeacher() { }

    @Override
    public void teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Flying")) {
            pokemon.addMoves(List.of("Hurricane", "Gust"));
        }
        if(null != nextMoveTeacher) this.nextMoveTeacher.teachMove(pokemon);
    }

    @Override
    public void setNextMoveTeacher(MoveTeacher moveTeacher) {
        this.nextMoveTeacher = moveTeacher;
    }
}
