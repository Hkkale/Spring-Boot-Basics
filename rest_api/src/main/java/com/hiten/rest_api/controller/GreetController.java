package com.hiten.rest_api.controller;

import com.hiten.rest_api.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("greet")
public class GreetController {
    @GetMapping()
    public String greetings(){
        return "Hello Sir!";
    }

    @GetMapping("/morning")
    public String morning(){
        return "Good morning Sir!";
    }
    @GetMapping("/bye")
    public String bye(){
        return "Good bye Sir!";
    }

















}
