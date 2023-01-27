package com.example.spring;

import com.example.spring.models.Car;
import java.lang.Class;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        var car = context.getBean("car", Car.class);
        System.out.println(car);
        context.close();
    }
}
