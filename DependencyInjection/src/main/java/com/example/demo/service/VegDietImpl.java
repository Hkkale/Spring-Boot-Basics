package com.example.demo.service;

import com.example.demo.service.Diet;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class VegDietImpl implements Diet {

    @Override
    public String todayDiet() {
        return "I am having Salad today";
    }
}
