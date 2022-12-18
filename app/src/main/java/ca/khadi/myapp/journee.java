package ca.khadi.myapp;

public class journee {
    private String petitDej, diner, souper;

    public journee(String petitDej, String diner, String souper) {
        this.petitDej = petitDej;
        this.diner = diner;
        this.souper = souper;
    }

    public journee() {
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
        return "journee{" +
                "petitDej='" + petitDej + '\'' +
                ", diner='" + diner + '\'' +
                ", souper='" + souper + '\'' +
                '}';
    }
}
