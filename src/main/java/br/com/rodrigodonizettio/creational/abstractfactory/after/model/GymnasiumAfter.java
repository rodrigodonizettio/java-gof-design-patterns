package br.com.rodrigodonizettio.creational.abstractfactory.after.model;

import br.com.rodrigodonizettio.creational.abstractfactory.after.factory.GymTrainerFactory;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.human.GymTrainer;


public class GymnasiumAfter {
    GymTrainer gymTrainer;

    public GymnasiumAfter(City city) {
        gymTrainer = GymTrainerFactory.createGymTrainer(city);
    }

    public GymTrainer getGymTrainer() {
        return gymTrainer;
    }
}
