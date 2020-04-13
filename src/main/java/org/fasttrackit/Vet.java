package org.fasttrackit;

public class Vet {

    private String name;
    private String specialization;
    private String medicines;
    private int medicinePrice;
    private int vaccinationPrice;

    public Vet(String name, int medicinePrice, int vaccinationPrice) {
        this.name = name;
        this.medicinePrice = medicinePrice;
        this.vaccinationPrice = vaccinationPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public int getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(int medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public int getVaccinationPrice() {
        return vaccinationPrice;
    }

    public void setVaccinationPrice(int vaccinationPrice) {
        this.vaccinationPrice = vaccinationPrice;
    }
}
