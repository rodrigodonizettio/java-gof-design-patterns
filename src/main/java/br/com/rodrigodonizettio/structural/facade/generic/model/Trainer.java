package br.com.rodrigodonizettio.structural.facade.generic.model;

import br.com.rodrigodonizettio.structural.facade.before.service.MartCashierServiceBefore;
import br.com.rodrigodonizettio.structural.facade.before.service.MartPhoneServiceBefore;

import java.util.List;

public class Trainer {
    private List<String> itemsToBuy;
    private String phoneToCall;
    private boolean hasPhoneToken = false;

    public Trainer(List<String> itemsToBuy, String phoneToCall) {
        this.itemsToBuy = itemsToBuy;
        this.phoneToCall = phoneToCall;
    }

    public void buyItems(MartCashierServiceBefore martCashierService) {
        itemsToBuy.forEach(itemToBuy -> {
            martCashierService.sellItem(itemToBuy);
            if("Phone Token".equals(itemToBuy)) hasPhoneToken = true;
        });
    }

    public void callPhone(MartPhoneServiceBefore martPhoneService) {
        if(hasPhoneToken) martPhoneService.callPhone(phoneToCall);
        else System.out.println("Damn! I need to go to the Cashier and buy a Phone Token first!");
    }

    public String getPhoneToCall() {
        return phoneToCall;
    }

    public List<String> getItemsToBuy() {
        return itemsToBuy;
    }

    public boolean hasPhoneToken() {
        return hasPhoneToken;
    }

    public void setHasPhoneToken(boolean hasPhoneToken) {
        this.hasPhoneToken = hasPhoneToken;
    }
}
