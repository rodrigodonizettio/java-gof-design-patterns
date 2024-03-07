package br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.controller;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.DragonMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.ElectricMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.FireMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.FlyingMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.GrassMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.MoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.NormalAndBaseMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.PoisonMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.PsychicMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.after.chain.WaterMoveTeacher;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.before.MoveTeacherBefore;
import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Before. A single class with a big if cares about teaching moves to the pokemon");
        MoveTeacherBefore moveTeacherBefore = new MoveTeacherBefore();

        Pokemon bulbasaurBefore = new Pokemon("BulbasaurBefore", List.of("Grass", "Poison"));
        moveTeacherBefore.teachMove(bulbasaurBefore);
        System.out.println("Pokemon " + bulbasaurBefore.getName() + " has the moves: " + bulbasaurBefore.getMoves());

        Pokemon dragoniteBefore = new Pokemon("DragoniteBefore", List.of("Normal", "Flying", "Fire", "Electric", "Dragon", "Psychic", "Water"));
        moveTeacherBefore.teachMove(dragoniteBefore);
        System.out.println("Pokemon " + dragoniteBefore.getName() + " has the moves: " + dragoniteBefore.getMoves());


        System.out.println("After. A chain of classes care about teaching moves to the pokemon");
        MoveTeacher normalAndBaseMoveTeacher = new NormalAndBaseMoveTeacher();
        MoveTeacher grassMoveTeacher = new GrassMoveTeacher();
        MoveTeacher poisonMoveTeacher = new PoisonMoveTeacher();
        MoveTeacher fireMoveTeacher = new FireMoveTeacher();
        MoveTeacher electricMoveTeacher = new ElectricMoveTeacher();
        MoveTeacher flyingMoveTeacher = new FlyingMoveTeacher();
        MoveTeacher dragonMoveTeacher = new DragonMoveTeacher();
        MoveTeacher psychicMoveTeacher = new PsychicMoveTeacher();
        MoveTeacher waterMoveTeacher = new WaterMoveTeacher();

        normalAndBaseMoveTeacher.setNextMoveTeacher(grassMoveTeacher);
        grassMoveTeacher.setNextMoveTeacher(poisonMoveTeacher);
        poisonMoveTeacher.setNextMoveTeacher(fireMoveTeacher);
        fireMoveTeacher.setNextMoveTeacher(electricMoveTeacher);
        electricMoveTeacher.setNextMoveTeacher(flyingMoveTeacher);
        flyingMoveTeacher.setNextMoveTeacher(dragonMoveTeacher);
        dragonMoveTeacher.setNextMoveTeacher(psychicMoveTeacher);
        psychicMoveTeacher.setNextMoveTeacher(waterMoveTeacher);


        Pokemon bulbasaurAfter = new Pokemon("BulbasaurAfter", List.of("Grass", "Poison"));
        normalAndBaseMoveTeacher.teachMove(bulbasaurAfter);
        System.out.println("Pokemon " + bulbasaurAfter.getName() + " has the moves: " + bulbasaurAfter.getMoves());

        Pokemon dragoniteAfter = new Pokemon("DragoniteAfter", List.of("Normal", "Flying", "Fire", "Electric", "Dragon", "Psychic", "Water"));
        normalAndBaseMoveTeacher.teachMove(dragoniteAfter);
        System.out.println("Pokemon " + dragoniteAfter.getName() + " has the moves: " + dragoniteAfter.getMoves());
    }
}
