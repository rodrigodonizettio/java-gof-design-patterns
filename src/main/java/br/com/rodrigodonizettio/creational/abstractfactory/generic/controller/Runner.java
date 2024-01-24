package br.com.rodrigodonizettio.creational.abstractfactory.generic.controller;

import br.com.rodrigodonizettio.creational.abstractfactory.after.model.GymnasiumAfter;
import br.com.rodrigodonizettio.creational.abstractfactory.before.model.GymnasiumBefore;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City;

public class Runner {
    public static void main(String[] args) {
        GymnasiumBefore gymnasiumBefore = new GymnasiumBefore(City.PEWTER);
        System.out.println("Badge which belongs to GymnasiumBefore: " + gymnasiumBefore.getGymTrainer().getBadge().getName());
        gymnasiumBefore.getGymTrainer().getPokemons().forEach(
                p -> System.out.println("Pokemon which belongs to GymnasiumBefore says: " + p.speak())
        );

        GymnasiumAfter gymnasiumAfter = new GymnasiumAfter(City.CERULEAN);
        System.out.println("Badge which belongs to GymnasiumAfter: " + gymnasiumAfter.getGymTrainer().getBadge().getName());
        gymnasiumAfter.getGymTrainer().getPokemons().forEach(
                p -> System.out.println("Pokemon which belongs to GymnasiumAfter says: " + p.speak())
        );

    }
}
