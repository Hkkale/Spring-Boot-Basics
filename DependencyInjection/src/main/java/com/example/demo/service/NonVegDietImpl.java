package com.example.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class NonVegDietImpl implements Diet {

    @PostConstruct
    public void postDo(){
        System.out.println("NovegDietImpl Iniutialize-----------------");
    }

    public String todayDiet() {
        return "I am having Biryani today";
    }
}
