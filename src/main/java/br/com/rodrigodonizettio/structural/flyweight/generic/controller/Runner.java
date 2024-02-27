package br.com.rodrigodonizettio.structural.flyweight.generic.controller;

import br.com.rodrigodonizettio.structural.flyweight.after.model.BulbasaurFlyweight;
import br.com.rodrigodonizettio.structural.flyweight.after.model.BulbasaurSingleton;
import br.com.rodrigodonizettio.structural.flyweight.before.model.Bulbasaur;

import java.util.Random;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        int minLevel = 1;
        int maxLevel = 15;
        int bulbasaurCount = 5000000;
        for (int i = 0; i < bulbasaurCount; i++) {
            Random r = new Random();
            Bulbasaur bulbasaur = new Bulbasaur(r.nextInt(maxLevel-minLevel) + minLevel);
        }
        int mb = 1024*1024;
        long consumedMemoryBefore = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/mb;
        System.out.println("Before. The amount of consumed memory for " + bulbasaurCount + " Bulbasaur is " + consumedMemoryBefore + "MB");

        System.out.println("Calling Garbage Collector to try to recycle memory from unused objects");
        System.gc();
        Thread.sleep(5000);

        for (int i = 0; i < bulbasaurCount; i++) {
            Random r = new Random();
            BulbasaurFlyweight bulbasaurFlyweight = new BulbasaurFlyweight(BulbasaurSingleton.getInstance(), r.nextInt(maxLevel-minLevel) + minLevel);
        }
        long consumedMemoryAfter = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/mb;
        System.out.println("After. The amount of consumed memory for " + bulbasaurCount + " BulbasaurFlyweight is " + consumedMemoryAfter + "MB");

    }
}
