package br.com.rodrigodonizettio.structural.facade.after.service;

import java.util.Map;
import java.util.NoSuchElementException;

public class MartCashierServiceAfter {
    private Map<String, Float> items = Map.of(
            "Potion", 200f,
            "Phone Token", 10f);

    protected MartCashierServiceAfter() { }

    public void sellItem(String itemName) {
        try {
            Float itemPrice = items.get(itemName);
            System.out.println("The requested item " + itemName + " is available and cost " + itemPrice + " pokedollars");
        } catch (NoSuchElementException e) {
            System.out.println("The requested item " + itemName + " is unavailable");
        }
    }
}
