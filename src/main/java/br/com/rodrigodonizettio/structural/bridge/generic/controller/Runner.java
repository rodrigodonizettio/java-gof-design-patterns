package br.com.rodrigodonizettio.structural.bridge.generic.controller;

import br.com.rodrigodonizettio.structural.bridge.after.machine.technical.TM09;
import br.com.rodrigodonizettio.structural.bridge.after.machine.technical.TM22;
import br.com.rodrigodonizettio.structural.bridge.after.Bulbasaur;
import br.com.rodrigodonizettio.structural.bridge.before.BulbasaurTM09;
import br.com.rodrigodonizettio.structural.bridge.before.BulbasaurTM22;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Before. Every new TM requires a new Pokemon implementation");
        BulbasaurTM09 bulbasaurTM09 = new BulbasaurTM09("Bulbasaur1");
        System.out.println(bulbasaurTM09);
        BulbasaurTM22 bulbasaurTM22 = new BulbasaurTM22("Bulbasaur2");
        System.out.println(bulbasaurTM22);

        System.out.println("After. New TMs can be created without the needing of a new Pokemon implementation");
        Bulbasaur bulbasaur1WithAnyTM = new Bulbasaur("Bulbasaur3", new TM09());
        System.out.println(bulbasaur1WithAnyTM);
        Bulbasaur bulbasaur2WithAnyTM = new Bulbasaur("Bulbasaur4", new TM22());
        System.out.println(bulbasaur2WithAnyTM);


    }
}
