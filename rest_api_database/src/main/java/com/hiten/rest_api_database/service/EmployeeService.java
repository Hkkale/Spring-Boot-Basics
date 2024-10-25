package com.hiten.rest_api_database.service;

import com.hiten.rest_api_database.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(int id);
}
