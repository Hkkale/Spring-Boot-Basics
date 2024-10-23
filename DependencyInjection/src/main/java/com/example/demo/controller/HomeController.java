package com.example.demo.controller;

import com.example.demo.service.Diet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {




    Diet diet;

    @Autowired
//    @Qualifier("nonVegDietImpl")
    public void setDiet(Diet diet){
        this.diet=diet;
    }



    HomeController(){}
//
//
//
//    public void setDiet(Diet diet){
//        this.diet=diet;
//    }

    @GetMapping("/diet")
    public String dietCall(){
        return "Hello "+ diet.todayDiet();

    }

}
