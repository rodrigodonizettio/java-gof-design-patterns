package br.com.rodrigodonizettio.creational.singleton.generic.controller;

import br.com.rodrigodonizettio.creational.singleton.after.MewtwoAfter;
import br.com.rodrigodonizettio.creational.singleton.before.model.MewtwoBefore;
import br.com.rodrigodonizettio.creational.singleton.generic.model.Pokemon;

public class Runner {
    public static void main(String[] args) {
        Pokemon mewtwo1 = new MewtwoBefore();
        Pokemon mewtwo2 = new MewtwoBefore();
        System.out.println("Before: Is MewTwo1 and MewTwo2 the same pokemon?");
        if(mewtwo1.equals(mewtwo2)) System.out.println("Yes! That's great because there's just one Mewtwo in pokemon world!");
        else System.out.println("No! Something is wrong because there's just one Mewtwo in pokemon world!");

        Pokemon mewtwo3 = MewtwoAfter.getInstance();
        Pokemon mewtwo4 = MewtwoAfter.getInstance();
//        Pokemon mewtwo5 = new MewtwoAfter(); // Now we can't create a "new" instance because constructor is hidden by the "private" modifier, enforcing to use the "getInstance" singleton method
        System.out.println("After: Is MewTwo3 and MewTwo4 the same pokemon?");
        if(mewtwo3.equals(mewtwo4)) System.out.println("Yes! That's great because there's just one Mewtwo in pokemon world!");
        else System.out.println("No! Something is wrong because there's just one Mewtwo in pokemon world!");
    }
}
