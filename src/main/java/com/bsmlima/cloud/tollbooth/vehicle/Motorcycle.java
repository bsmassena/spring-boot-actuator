package com.bsmlima.cloud.tollbooth.vehicle;

public class Motorcycle implements Vehicle {
    private static final double PRICE = 1;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
