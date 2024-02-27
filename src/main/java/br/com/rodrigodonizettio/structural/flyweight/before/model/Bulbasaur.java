package br.com.rodrigodonizettio.structural.flyweight.before.model;

public class Bulbasaur {
    private final String name = "Bulbasaur";
    private final String type = "Grass + Poison";
    private final double height = 0.7;
    private final double weight = 6.9;
//    private final String name;
//    private final String type;
//    private final double height;
//    private final double weight;
    private int level;

//    public Bulbasaur(String name, String type, double height, double weight, int level) {
//        this.name = name;
//        this.type = type;
//        this.height = height;
//        this.weight = weight;
//        this.level = level;
//    }

    public Bulbasaur(int level) {
        this.level = level;
    }
}
