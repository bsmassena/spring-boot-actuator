package com.bsmlima.cloud.tema05.vehicle;

public class Motorcycle implements Vehicle {
    private static final double PRICE = 1;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
