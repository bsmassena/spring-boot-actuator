package com.bsmlima.cloud.tema05.application;

import com.bsmlima.cloud.tema05.service.TollboothService;
import com.bsmlima.cloud.tema05.vehicle.*;
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
