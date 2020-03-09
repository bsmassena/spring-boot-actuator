package com.bsmlima.cloud.tollbooth.application;

import com.bsmlima.cloud.tollbooth.service.TollboothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/tollbooth")
public class TollboothController {

    @Autowired
    private TollboothService ts;

    @GetMapping
    public Map<String, Double> tollboothPrices() {
        return ts.getPrices();
    }

    @GetMapping(value = "/{vehicleType}", params = "value")
    public String tollboothChange(@PathVariable String vehicleType, @RequestParam double value) {
        return String.format("%.2f", ts.doTollboothPayment(vehicleType, value));
    }

    @GetMapping(value = "/{vehicleType}", params = { "value", "axles"})
    public String tollboothChangeWithAxles(@PathVariable String vehicleType, @RequestParam double value, @RequestParam int axles) {
        return String.format("%.2f", ts.doTollboothPayment(vehicleType, value, axles));
    }

}
