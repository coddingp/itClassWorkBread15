package com.company;

public class TandyrConedBread extends Bread {
    double radius;

    public TandyrConedBread(String producer, double weight, double price, double length) {
        super(producer, weight, price);
        this.radius = length;
    }

    public void setRadius(double length) {
        this.radius = length;
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public void setProducer(String producer) {
        super.setProducer(producer);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getWeight() {
        if (this.weight > 0) {
            return super.getWeight();
        }
        return 0;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public double getRadius() {
        return radius;
    }

    public void drowing() {
        System.out.println("There is drawing on the bread");
    }

    public void varnish() {
        System.out.println("Varnish");
    }

    @Override
    public String toString() {
        return "TandyrConedBread{" +
                "radius=" + radius +
                '}';
    }
}
