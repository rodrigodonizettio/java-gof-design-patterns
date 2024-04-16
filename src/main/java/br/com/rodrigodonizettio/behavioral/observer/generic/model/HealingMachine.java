package br.com.rodrigodonizettio.behavioral.observer.generic.model;

import java.util.ArrayList;
import java.util.List;


public class HealingMachine {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        System.out.println("Pokemon Trainer " + ((Trainer) observer).getName() + " arrives the Poke Center and leave his/hers Pokemons to get healed");
        observers.add(observer);
    }

    public void notifyObservers(String trainerName) throws InterruptedException {
        Thread.sleep((long)(Math.random() * 10000));
        System.out.println("Good news! " + trainerName + " Pokemons were healed!");
        observers.forEach(o -> o.notifyPokemonHealed(trainerName));
    }
}
