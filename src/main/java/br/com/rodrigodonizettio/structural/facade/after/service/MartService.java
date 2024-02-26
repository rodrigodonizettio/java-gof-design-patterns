package br.com.rodrigodonizettio.structural.facade.after.service;

import br.com.rodrigodonizettio.structural.facade.generic.model.Trainer;

public class MartService {
    private MartCashierServiceAfter martCashierService;
    private MartPhoneServiceAfter martPhoneService;

    public MartService() {
        this.martCashierService = new MartCashierServiceAfter();
        this.martPhoneService = new MartPhoneServiceAfter();
    }

    public void callPhone(Trainer trainer) {
        if(trainer.hasPhoneToken()) martPhoneService.callPhone(trainer.getPhoneToCall());
        else {
            martCashierService.sellItem("Phone Token");
            trainer.setHasPhoneToken(true);
            martPhoneService.callPhone(trainer.getPhoneToCall());
            System.out.println("Great! The Phone Token was automatically bought!");
        }
    }
}
