package br.com.rodrigodonizettio.creational.abstractfactory.after.factory;

import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Boulder;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.badge.Cascade;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.city.City;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.human.GymTrainer;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Geodude;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Onix;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Starmie;
import br.com.rodrigodonizettio.creational.abstractfactory.generic.model.pokemon.Staryu;

import java.util.List;

public class GymTrainerFactory {
    public static GymTrainer createGymTrainer(City city) throws IllegalArgumentException {
        if(city == City.PEWTER) return new GymTrainer(List.of(new Geodude(), new Onix()), new Boulder());
        else if(city == City.CERULEAN) return new GymTrainer(List.of(new Staryu(), new Starmie()), new Cascade());
        else throw new IllegalArgumentException("Invalid City Name");
    }
}
