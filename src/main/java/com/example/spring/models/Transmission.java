package com.example.spring.models;

public class Transmission {
    private int numberOfGears;
    private String type;
    private double weight;
    private double price;

    public Transmission(int numberOfGears, String type, double weight, double price) {
        this.numberOfGears = numberOfGears;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "numberOfGears=" + numberOfGears +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
