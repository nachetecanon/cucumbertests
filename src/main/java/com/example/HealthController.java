package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by icanon on 13/10/16.
 */
@RestController
public class HealthController {

    @RequestMapping(value = "/health", produces = "application/json")
    public Health health() {
        return new Health("jersey: up");
    }
}
