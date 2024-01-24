package br.com.rodrigodonizettio.creational.abstractfactory.before.model;

import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Badge;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Boulder;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Cascade;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.human.GymTrainer;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Geodude;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Onix;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Pokemon;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Starmie;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Staryu;

import java.util.List;

import static br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City.CERULEAN;
import static br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City.PEWTER;

public class GymnasiumBefore {
    GymTrainer gymTrainer;

    public GymnasiumBefore(City city) {
        if(city == PEWTER) {
            this.gymTrainer = new GymTrainer(List.of(new Geodude(), new Onix()), new Boulder());
        } else if(city == CERULEAN) {
            this.gymTrainer = new GymTrainer(List.of(new Staryu(), new Starmie()), new Cascade());
        } else throw new IllegalArgumentException("Invalid Gym City Name");
    }

    public GymTrainer getGymTrainer() {
        return gymTrainer;
    }
}
