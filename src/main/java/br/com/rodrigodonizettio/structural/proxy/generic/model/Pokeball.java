package br.com.rodrigodonizettio.structural.proxy.generic.model;

public class Pokeball {
    private String pokemonName;
    private String trainerName;

    public Pokeball(String pokemonName, String trainerName) {
        this.pokemonName = pokemonName;
        this.trainerName = trainerName;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getTrainerName() {
        return trainerName;
    }
}
