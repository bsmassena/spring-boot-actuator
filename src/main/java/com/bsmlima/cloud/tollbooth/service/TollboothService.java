package com.bsmlima.cloud.tollbooth.service;

import com.bsmlima.cloud.tollbooth.vehicle.Vehicle;
import com.bsmlima.cloud.tollbooth.vehicle.VehicleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class TollboothService {

    @Autowired
    private ApplicationContext ac;

    public double doTollboothPayment(String vehicleType, double value) {
        if(vehicleType.equals("truck"))
            throw new IllegalArgumentException("You must inform the number of axles of the truck");

        Vehicle vehicle = ac.getBean(vehicleType, Vehicle.class);
        double price = vehicle.getTollboothPrice();

        if(value < price) throw new IllegalArgumentException("Value must be higher than the final price");

        return value - price;
    }

    public double doTollboothPayment(String vehicleType, double value, int axles) {
        if(!vehicleType.equals("truck"))
            throw new IllegalArgumentException("You just need to inform the number of axles for trucks");

        Vehicle vehicle = ac.getBean(vehicleType, Vehicle.class);
        double price = vehicle.getTollboothPrice() + axles;

        if(value < price) throw new IllegalArgumentException("Value must be higher than the final price");

        return value - price;
    }

    public Map<String, Double> getPrices() {
        Map<String, Double> prices = new HashMap<>();

        for (VehicleTypes vehicleType : VehicleTypes.values()) {
            Vehicle vehicle = ac.getBean(vehicleType.toString().toLowerCase(), Vehicle.class);
            prices.put(vehicleType.toString().toLowerCase(), vehicle.getTollboothPrice());
        }

        return prices;
    }
}
