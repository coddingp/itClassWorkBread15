package com.company;

public class ArmenianBread extends Bread {
    double radius;
    double thickness;

    public ArmenianBread(String producer, double weight, double price, double radius, double thickness) {
        super(producer, weight, price);
        this.radius = radius;
        this.thickness = thickness;
    }

    public void setThickness(double radius) {
        this.radius = radius;
    }

    public double getThickness() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void envelope() {
        System.out.println("I am Lavash, I has been Enveloped");
    }

    @Override
    public void pack() {
        System.out.println("Lavash is ready and packed");
    }

    @Override
    public String toString() {
        return "ArmenianBread{" +
                "radius=" + radius +
                ", thickness=" + thickness +
                '}';
    }
}
