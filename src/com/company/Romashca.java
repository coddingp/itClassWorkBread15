package com.company;

public class Romashca extends Bread {
    int lepestok;

    public Romashca(String producer, double weight, double price, int lepestok) {
        super(producer, weight, price);

        this.lepestok = lepestok;
    }

    public void setThickness(int lepestok) {
        this.lepestok = lepestok;
    }

    public double getThickness() {
        return lepestok;
    }

    public void setRadius(int lepestok) {
        this.lepestok = lepestok;
    }

    public double getRadius() {
        return lepestok;
    }

    @Override
    public String toString() {
        return "Romashca{" +
                "lepestok=" + lepestok +
                '}';
    }
}
