package com.example.spring.models;

public class Engine {
    private double horsepower;
    private double volume;
    private double weight;
    private double price;
    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", volume=" + volume +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
