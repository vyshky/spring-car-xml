package com.example.spring.models;

public class CarBody {

    private String type;
    private double weight;
    private double price;

    public void Init() {
        this.type = "Кабриолет";
        this.weight = 1_160D;
        this.price = 500_000D;
    }

    @Override
    public String toString() {
        return "CarBody{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
