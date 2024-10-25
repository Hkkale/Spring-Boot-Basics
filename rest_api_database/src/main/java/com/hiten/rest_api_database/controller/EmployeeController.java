package com.hiten.rest_api_database.controller;


import com.hiten.rest_api_database.model.Employee;
import com.hiten.rest_api_database.service.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    EmployeeService employeeService;

    public  EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getAllEmployees(@PathVariable int employeeId){
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return  employeeService.save(employee);

    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return  employeeService.update(employee);

    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        employeeService.delete(employeeId);

        return "Deleted Sucessfully";

    }


}
