package com.cfx.demo.car;

public class BenzCar implements ICar{

    private String name;

    private int price;

    public BenzCar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
