package br.com.rodrigodonizettio.creational.prototype.before;

import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Personality;
import br.com.rodrigodonizettio.creational.prototype.generic.model.personality.Type;
import br.com.rodrigodonizettio.creational.prototype.generic.model.pokemon.Pokemon;

import java.util.List;

public class MewtwoBefore implements Pokemon {
    private List<String> moves;
    private Personality personality;

    public MewtwoBefore(List<String> moves) {
        this.moves = moves;
        this.personality = new Personality(Type.EVIL);
    }

    @Override
    public String speak() { return "Roaaarr!"; }

    @Override
    public String toString() {
        return "MewtwoBefore{" +
                "moves=" + moves +
                ", personality=" + personality +
                '}';
    }
}
