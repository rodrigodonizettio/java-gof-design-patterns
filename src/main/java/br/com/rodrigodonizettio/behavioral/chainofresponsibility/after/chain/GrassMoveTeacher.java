package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class GrassMoveTeacher implements MoveTeacher {
    private MoveTeacher nextMoveTeacher;

    public GrassMoveTeacher() { }

    @Override
    public void teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Grass")) {
            pokemon.addMoves(List.of("Vine Whip", "Razor Leaf"));
        }
        if(null != nextMoveTeacher) this.nextMoveTeacher.teachMove(pokemon);
    }

    @Override
    public void setNextMoveTeacher(MoveTeacher moveTeacher) {
        this.nextMoveTeacher = moveTeacher;
    }
}
