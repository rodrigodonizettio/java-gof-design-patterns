package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.MoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class NormalAndBaseMoveTeacher implements MoveTeacher {
    private MoveTeacher nextMoveTeacher;

    public NormalAndBaseMoveTeacher() { }

    @Override
    public void teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Normal")) {
            pokemon.addMoves(List.of("Wrap", "Safeguard"));
        }
        if(null != nextMoveTeacher) this.nextMoveTeacher.teachMove(pokemon);
    }

    @Override
    public void setNextMoveTeacher(MoveTeacher moveTeacher) {
        this.nextMoveTeacher = moveTeacher;
    }
}
