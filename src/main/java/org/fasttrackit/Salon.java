package org.fasttrackit;

public class Salon {

    private String service;
    private String name;
    private int priceOfService;
    private int availableMoney;

    public Salon(String service, int priceOfService, int availableMoney) {
        this.service = service;
        this.priceOfService = priceOfService;
        this.availableMoney = availableMoney;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceOfService() {
        return priceOfService;
    }

    public void setPriceOfService(int priceOfService) {
        this.priceOfService = priceOfService;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }
}