package br.com.rodrigodonizettio.structural.facade.after.service;

public class MartPhoneServiceAfter {
    protected MartPhoneServiceAfter() { }

    public void callPhone(String phoneNumber) {
        System.out.println("Calling to " + phoneNumber);
    }
}
