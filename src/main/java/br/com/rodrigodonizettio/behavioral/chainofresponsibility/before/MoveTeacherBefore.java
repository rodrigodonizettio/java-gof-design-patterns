package br.com.rodrigodonizettio.behavioral.chainofresponsibility.before;

import br.com.rodrigodonizettio.behavioral.chainofresponsibility.generic.model.Pokemon;

import java.util.List;


public class MoveTeacherBefore {
    public Pokemon teachMove(Pokemon pokemon) {
        if(pokemon.getType().contains("Normal")) {
            pokemon.addMoves(List.of("Wrap", "Safeguard"));
        }
        if(pokemon.getType().contains("Grass")) {
            pokemon.addMoves(List.of("Vine Whip", "Razor Leaf"));
        }
        if(pokemon.getType().contains("Poison")) {
            pokemon.addMoves(List.of("Poison Powder", "Acid"));
        }
        if(pokemon.getType().contains("Fire")) {
            pokemon.addMoves(List.of("Fire Punch", "Ember"));
        }
        if(pokemon.getType().contains("Electric")) {
            pokemon.addMoves(List.of("Thunder Punch", "Thunder Wave"));
        }
        if(pokemon.getType().contains("Flying")) {
            pokemon.addMoves(List.of("Hurricane", "Gust"));
        }
        if(pokemon.getType().contains("Dragon")) {
            pokemon.addMoves(List.of("Dragon Tail", "Dragon Dance"));
        }
        if(pokemon.getType().contains("Psychic")) {
            pokemon.addMoves(List.of("Dream Eater", "Confusion"));
        }
        if(pokemon.getType().contains("Water")) {
            pokemon.addMoves(List.of("Rain Dance", "Aqua Tail"));
        }
        return pokemon;
    }
}
