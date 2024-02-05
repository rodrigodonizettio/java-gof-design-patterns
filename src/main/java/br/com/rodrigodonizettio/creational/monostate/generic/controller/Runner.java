package br.com.rodrigodonizettio.creational.monostate.generic.controller;

import br.com.rodrigodonizettio.creational.monostate.generic.model.Pokemon;
import br.com.rodrigodonizettio.creational.monostate.after.model.MewtwoAfter;
import br.com.rodrigodonizettio.creational.monostate.before.model.MewtwoBefore;

public class Runner {
    public static void main(String[] args) {
        Pokemon mewtwo1 = new MewtwoBefore();
        Pokemon mewtwo2 = new MewtwoBefore();
        System.out.println("Before: Is MewTwo1 and MewTwo2 the same pokemon?");
        if(mewtwo1.equals(mewtwo2)) System.out.println("Yes! That's great because there's just one Mewtwo in pokemon world!");
        else System.out.println("No! Something is wrong because there's just one Mewtwo in pokemon world!");

        Pokemon mewtwo3 = new MewtwoAfter().getInstance();
        Pokemon mewtwo4 = new MewtwoAfter().getInstance();
//        Pokemon mewtwo5 = new MewtwoAfter(); // Now we can create a "new" instance because constructor is not hidden by the "private" modifier, and it has a private static attribute that can be an Interface which wasn't possible using Singleton
        System.out.println("After: Is MewTwo3 and MewTwo4 the same pokemon?");
        if(mewtwo3.equals(mewtwo4)) System.out.println("Yes! That's great because there's just one Mewtwo in pokemon world!");
        else System.out.println("No! Something is wrong because there's just one Mewtwo in pokemon world!");
    }
}
