package com.company;

public class Bread {
    String producer;
    double weight;
    double price;

    public Bread(String producer,
                 double weight,
                 double price) {
        this.producer = producer;
        this.weight = weight;
        this.price = price;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void bake() {
        System.out.println("Bread has been baked!");
    }

    public void pack() {
        System.out.println("Bread has been packed!");
    }

    @Override
    public String toString() {
        return "Bread{" +
                "producer='" + producer + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

}
