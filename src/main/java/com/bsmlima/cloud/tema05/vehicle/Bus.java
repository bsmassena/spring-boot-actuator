package com.bsmlima.cloud.tema05.vehicle;

public class Bus implements Vehicle {
    private static final double PRICE = 1.59;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
