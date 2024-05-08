package br.com.rodrigodonizettio.behavioral.templatemethod.generic.model;

public class TrainerCustomActions extends TrainerTemplateActions {
    private String customAction;

    public TrainerCustomActions(String trainerName, String pokemonName, String customAction) {
        super(trainerName, pokemonName);
        this.customAction = customAction;
    }

    @Override
    public void performCustomAction() {
        System.out.println("Trainer " + super.getTrainerName() + " " + customAction);
    }
}
