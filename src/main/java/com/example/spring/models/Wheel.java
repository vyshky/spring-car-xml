package com.example.spring.models;

public class Wheel {
    private double diameter;
    private double weight;
    private double price;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
