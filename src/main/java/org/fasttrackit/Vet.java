package org.fasttrackit;

public class Vet {

    String name;
    String specialization;
    String medicines;
    int medicinePrice;
    int vaccinationPrice;

    public Vet(String name, int medicinePrice, int vaccinationPrice) {
        this.name = name;
        this.medicinePrice = medicinePrice;
        this.vaccinationPrice = vaccinationPrice;
    }
}
