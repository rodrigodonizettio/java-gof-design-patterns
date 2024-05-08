package br.com.rodrigodonizettio.behavioral.templatemethod.generic.model;

public abstract class TrainerTemplateActions {
    private String trainerName;
    private String pokemonName;

    public TrainerTemplateActions(String name, String pokemonName) {
        this.trainerName = name;
        this.pokemonName = pokemonName;
    }

    public abstract void performCustomAction();

    public void performTemplateActions() {
        System.out.println("- Step: Introducing trainer");
        System.out.println("Introducing the trainer " + trainerName + "!");
        System.out.println("- Step: Trainer chooses a pokemon");
        System.out.println(trainerName + " chooses the pokemon " + pokemonName + "!");
        System.out.println("- Step: Trainer do a custom action");
        performCustomAction();
    }

    public String getTrainerName() {
        return trainerName;
    }
}
