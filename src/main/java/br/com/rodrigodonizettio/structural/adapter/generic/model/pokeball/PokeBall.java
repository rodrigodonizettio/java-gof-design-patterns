package br.com.rodrigodonizettio.structural.adapter.generic.model.pokeball;

public class PokeBall {
    private float catchRate = 1f;
    private String pokemonName;

    public PokeBall(String pokemonName) { this.pokemonName = pokemonName; }

    public String getPokemonName() {
        return pokemonName;
    }
}
