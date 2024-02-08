package br.com.rodrigodonizettio.creational.prototype.generic.model.pokemon;

import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Personality;
import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Type;

import java.util.List;

public class Mew implements Pokemon, Cloneable {
    private String speak;
    private List<String> moves;
    private Personality personality;

    public Mew(List<String> moves) {
        this.moves = moves;
        this.speak = "Mew!";
        this.personality = new Personality(Type.GOOD);
    }

    @Override
    public String speak() { return speak; }

    public Personality getPersonality() {
        return personality;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return "Mew{" +
                "moves=" + moves +
                ", personality=" + personality +
                '}';
    }

    @Override
    public Mew clone() throws CloneNotSupportedException {
        Mew clonedMew = (Mew) super.clone();
        clonedMew.setPersonality(clonedMew.getPersonality().clone());
        return clonedMew;
    }
}
