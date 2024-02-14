package br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball;

public class GreatBall {
    private float catchRate = 1.5f;
    private String pokemonName;

    public GreatBall(String pokemonName) { this.pokemonName = pokemonName; }

    public String getPokemonName() {
        return pokemonName;
    }
}
