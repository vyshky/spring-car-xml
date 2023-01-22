package com.example.spring.models;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private CarBody body;
    private Engine engine;
    private Transmission transmission;
    private List<Wheel> wheels;
    private double price;
    private String brand;
    private String name;
    private double priceUp;

    public Car(CarBody body, Engine engine, Transmission transmission, List<Wheel> wheels, double price, String brand, String name, double priceUp) {
        this.body = body;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.price = price;
        this.brand = brand;
        this.name = name;
        this.priceUp = priceUp;
    }
    private void Init() {
        System.out.println("CarBean Создан");
    }

    private void Destroy() {
        System.out.println("CarBean Удален");
    }

    @Override
    public String toString() {
        return "Car{" +
                "body=" + body +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", priceUp=" + priceUp +
                '}';
    }
}
