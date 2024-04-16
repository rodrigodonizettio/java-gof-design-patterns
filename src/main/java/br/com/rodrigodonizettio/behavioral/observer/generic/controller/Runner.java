package br.com.rodrigodonizettio.behavioral.observer.generic.controller;

import br.com.rodrigodonizettio.behavioral.observer.generic.model.HealingMachine;
import br.com.rodrigodonizettio.behavioral.observer.generic.model.Trainer;


public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Trainer trainer1 = new Trainer("Ash");
        Trainer trainer2 = new Trainer("Misty");

        HealingMachine healingMachine = new HealingMachine();
        healingMachine.add(trainer1);
        healingMachine.add(trainer2);

        healingMachine.notifyObservers("Misty");
        healingMachine.notifyObservers("Ash");
    }
}
