package com.bsmlima.cloud.tollbooth.application;

import com.bsmlima.cloud.tollbooth.service.TollboothService;
import com.bsmlima.cloud.tollbooth.vehicle.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public TollboothService tollboothService() {
        return new TollboothService();
    }

    @Bean
    public Beetle beetle() {
        return new Beetle();
    }

    @Bean
    public Bike bike() {
        return new Bike();
    }

    @Bean
    public Bus bus() {
        return new Bus();
    }

    @Bean
    public Motorcycle motorcycle() {
        return new Motorcycle();
    }

    @Bean
    public Truck truck() {
        return new Truck();
    }
}
