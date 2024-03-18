package br.com.rodrigodonizettio.behavioral.memento.generic.model;

public class Pokemon {
    private String name;
    private String mood;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public PokemonMemento saveMood() {
        return new PokemonMemento(mood);
    }

    public void restoreMood(PokemonMemento pokemonMemento) {
        mood = pokemonMemento.getMood();
    }


    public static class PokemonMemento {
        private final String mood;

        private PokemonMemento(String mood) {
            this.mood = mood;
        }

        public String getMood() {
            return mood;
        }
    }
}
