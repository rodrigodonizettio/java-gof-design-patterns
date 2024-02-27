package br.com.rodrigodonizettio.structural.flyweight.after.model;

public class BulbasaurFlyweight {
    private BulbasaurSingleton bulbasaurSingleton;
    private int level;

    public BulbasaurFlyweight(BulbasaurSingleton bulbasaurSingleton, int level) {
        this.bulbasaurSingleton = bulbasaurSingleton;
        this.level = level;
    }
}
