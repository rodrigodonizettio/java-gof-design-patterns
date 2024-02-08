package br.com.rodrigodonizettio.creational.prototype.generic.model.personality;

public class Personality implements Cloneable {
    private Type type;

    public Personality(Type type) { this.type = type; }

    @Override
    public String toString() {
        return "Personality{" +
                "type=" + type +
                '}';
    }

    @Override
    public Personality clone() throws CloneNotSupportedException {
        return (Personality) super.clone();
    }
}
