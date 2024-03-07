package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class WaterMoveTeacher implements MoveTeacher {
    private MoveTeacher nextMoveTeacher;

    public WaterMoveTeacher() { }

    @Override
    public void teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Water")) {
            pokemon.addMoves(List.of("Rain Dance", "Aqua Tail"));
        }
        if(null != nextMoveTeacher) this.nextMoveTeacher.teachMove(pokemon);
    }

    @Override
    public void setNextMoveTeacher(MoveTeacher moveTeacher) {
        this.nextMoveTeacher = moveTeacher;
    }
}
