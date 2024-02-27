package br.com.rodrigodonizettio.structural.flyweight.after.model;

public class BulbasaurSingleton {
    private static BulbasaurSingleton bulbasaurSingleton = new BulbasaurSingleton();
    private final String name = "Bulbasaur";
    private final String type = "Grass + Poison";
    private final double height = 0.7;
    private final double weight = 6.9;

    private BulbasaurSingleton() { }

    public static BulbasaurSingleton getInstance() { return bulbasaurSingleton; }
}
