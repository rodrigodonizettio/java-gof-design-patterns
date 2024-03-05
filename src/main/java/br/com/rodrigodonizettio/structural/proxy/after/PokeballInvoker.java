package br.com.rodrigodonizettio.structural.proxy.after;

import br.com.rodrigodonizettio.structural.proxy.generic.model.Pokeball;

import java.util.List;

public class PokeballInvoker {
    public void usePokeball(String trainerName, List<Pokeball> pokeballs) {
        pokeballs.forEach(p -> {
            Pokeball validatedPokeball = validatePokeballOwner(trainerName, p);
           if(null != validatedPokeball) {
               System.out.println("Trainer '" + trainerName
                       + "' has invoked Pokemon '" + p.getPokemonName() + "'"
                       + " that belongs to himself/herself ");
           }
        });
    }

    private Pokeball validatePokeballOwner(String trainerName, Pokeball pokeball) {
        if(pokeball.getTrainerName().equals(trainerName)) return pokeball;
        else {
            System.out.println("Trainer '" + trainerName
                    + "' WAS FORBIDDEN to invoke Pokemon '" + pokeball.getPokemonName() + "'"
                    + " because it belongs to Trainer '" + pokeball.getTrainerName() + "'");
            return null;
        }
    }
}
