package com.bsmlima.cloud.tema05.vehicle;

public class Beetle implements Vehicle {
    private static final double PRICE = 2.11;

    @Override
    public double getTollboothPrice() {
        return PRICE;
    }
}
