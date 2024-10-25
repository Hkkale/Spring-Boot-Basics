package com.hiten.rest_api_database.repository;

import com.hiten.rest_api_database.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(int id);
}
