package org.fasttrackit;

public class Salon {

    String service;
    String name;
    int priceOfService;
    int availableMoney;

    public Salon(String service, int priceOfService, int availableMoney) {
        this.service = service;
        this.priceOfService = priceOfService;
        this.availableMoney = availableMoney;
    }
}