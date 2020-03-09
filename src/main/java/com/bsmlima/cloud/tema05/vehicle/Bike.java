package com.bsmlima.cloud.tema05.vehicle;

public class Bike implements Vehicle {
    private static final double PRICE = 0.49;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
