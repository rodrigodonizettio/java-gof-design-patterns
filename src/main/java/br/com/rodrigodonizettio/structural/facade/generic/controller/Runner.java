package br.com.rodrigodonizettio.structural.facade.generic.controller;

import br.com.rodrigodonizettio.structural.facade.after.service.MartService;
import br.com.rodrigodonizettio.structural.facade.before.service.MartCashierServiceBefore;
import br.com.rodrigodonizettio.structural.facade.before.service.MartPhoneServiceBefore;
import br.com.rodrigodonizettio.structural.facade.generic.model.Trainer;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Before. Pokemon Trainer using the Phone Service must first buy a coin from the Cashier Service");
        Trainer pokemonTrainer = new Trainer(List.of("Potion"), "+AA BB 9-1234-5678");
        MartCashierServiceBefore martCashierService = new MartCashierServiceBefore();
        MartPhoneServiceBefore martPhoneService = new MartPhoneServiceBefore();

        pokemonTrainer.buyItems(martCashierService);
        pokemonTrainer.callPhone(martPhoneService);

        System.out.println("After. Pokemon Trainer can easily use the Phone Service without needing to interact with the Cashier Service");
        // Now MartCashierService and MartPhoneService have protected scope and cannot be used by any class instead of MartService Facade
        MartService martService = new MartService();

        martService.callPhone(pokemonTrainer);
    }
}
