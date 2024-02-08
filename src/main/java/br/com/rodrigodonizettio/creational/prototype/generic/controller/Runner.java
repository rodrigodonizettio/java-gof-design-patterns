package br.com.rodrigodonizettio.creational.prototype.generic.controller;

import br.com.rodrigodonizettio.creational.prototype.before.MewtwoBefore;
import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Personality;
import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Type;
import br.com.rodrigodonizettio.creational.prototype.generic.model.pokemon.Mew;

import java.util.List;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mew mewBefore = new Mew(List.of("Imprison", "Psychic"));
        System.out.println("Pokemon Before Clone");
        System.out.println(mewBefore);
        System.out.println(mewBefore.speak());
        MewtwoBefore mewtwoBefore = new MewtwoBefore(List.of("Imprison", "Psychic"));
        System.out.println(mewtwoBefore);
        System.out.println(mewtwoBefore.speak());

        Mew mewAfter = new Mew(List.of("Imprison", "Psychic"));
        System.out.println("Pokemon After Clone");
        Mew mewtwoAfter = mewAfter.clone();
        mewtwoAfter.setSpeak("Roaaarr!");
        mewtwoAfter.setPersonality(new Personality(Type.EVIL));
        System.out.println(mewtwoAfter.speak());
        System.out.println(mewtwoAfter);
        System.out.println(mewAfter.speak());
        System.out.println(mewAfter);
        // As we can see mewtwo is a clone of Mew having the same moves. However it has a different speak and personality
    }
}
