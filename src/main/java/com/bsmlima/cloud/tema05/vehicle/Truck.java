package com.bsmlima.cloud.tema05.vehicle;

public class Truck implements Vehicle {
    private static final double PRICE = 3.95;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
