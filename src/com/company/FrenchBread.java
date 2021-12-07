package com.company;

public class FrenchBread extends Bread {
    double length;
    int cuts;

    public FrenchBread(String producer, double weight, double price, double length) {
        super(producer, weight, price);
        this.length = length;
    }

    public void setCuts(int cuts) {
        this.cuts = cuts;
    }

    public int getCuts() {
        return cuts;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    public void makeCuts(int cuts) {
        this.cuts = cuts;
        System.out.println("There are " + cuts + " cuts on the bread");
    }

    @Override
    public String toString() {
        return "FrenchBread{" +
                "length=" + length +
                '}';
    }
}
