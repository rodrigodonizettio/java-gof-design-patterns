package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class FireMoveTeacher implements MoveTeacher {
    private MoveTeacher nextMoveTeacher;

    public FireMoveTeacher() { }

    @Override
    public void teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Fire")) {
            pokemon.addMoves(List.of("Fire Punch", "Ember"));
        }
        if(null != nextMoveTeacher) this.nextMoveTeacher.teachMove(pokemon);
    }

    @Override
    public void setNextMoveTeacher(MoveTeacher moveTeacher) {
        this.nextMoveTeacher = moveTeacher;
    }
}
