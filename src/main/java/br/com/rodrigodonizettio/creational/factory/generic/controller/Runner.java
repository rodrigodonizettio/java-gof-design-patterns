package br.com.rodrigodonizettio.creational.factory.generic.controller;

import br.com.rodrigodonizettio.creational.factory.after.model.TrainerAfter;
import br.com.rodrigodonizettio.creational.factory.before.model.TrainerBefore;
import br.com.rodrigodonizettio.creational.factory.generic.model.Type;

public class Runner {
    public static void main(String[] args) {
        TrainerBefore trainerBefore = new TrainerBefore(Type.FIRE);
        System.out.println("Pokemon which belongs to TrainerBefore says: " + trainerBefore.getPokemon().speak());

        TrainerAfter trainerAfter = new TrainerAfter(Type.GRASS);
        System.out.println("Pokemon which belongs to TrainerAfter says: " + trainerAfter.getPokemon().speak());
    }
}
