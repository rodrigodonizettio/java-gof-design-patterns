package br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

public interface MoveTeacher {
    void teachMove(Pokemon pokemon);
    void setNextMoveTeacher(MoveTeacher moveTeacher);
}
