package br.com.rodrigodonizettio.behavioral.templatemethod.generic.controller;

import br.com.rodrigodonizettio.behavioral.templatemethod.generic.model.TrainerCustomActions;

public class Runner {
    public static void main(String[] args) {
        TrainerCustomActions trainer1 = new TrainerCustomActions("Ash", "Pikachu",
                "gets shiny eyes and believes his pokemon will win the fight!");
        TrainerCustomActions trainer2 = new TrainerCustomActions("Misty", "Staryu",
                "gets worried because she just have water type pokemons and the opponent is an electric type one!");

        trainer1.performTemplateActions();
        trainer2.performTemplateActions();
    }
}
