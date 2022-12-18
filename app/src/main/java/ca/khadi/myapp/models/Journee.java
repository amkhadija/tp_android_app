package ca.khadi.myapp.models;

public class Journee {
    private String petitDej, diner, souper, jour;

    public Journee(String petitDej, String diner, String souper) {
        this.petitDej = petitDej;
        this.diner = diner;
        this.souper = souper;
    }

    public Journee(String jour, String petitDej) {
        this.petitDej = petitDej;
        this.jour = jour;
    }

    public Journee(String petitDej, String diner, String souper, String jour) {
        this.petitDej = petitDej;
        this.diner = diner;
        this.souper = souper;
        this.jour = jour;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public Journee() {
    }

    public String getPetitDej() {
        return petitDej;
    }

    public void setPetitDej(String petitDej) {
        this.petitDej = petitDej;
    }

    public String getDiner() {
        return diner;
    }

    public void setDiner(String diner) {
        this.diner = diner;
    }

    public String getSouper() {
        return souper;
    }

    public void setSouper(String souper) {
        this.souper = souper;
    }

    @Override
    public String toString() {
        return "Journee{" +
                "petitDej='" + petitDej + '\'' +
                ", diner='" + diner + '\'' +
                ", souper='" + souper + '\'' +
                ", jour='" + jour + '\'' +
                '}';
    }
}
