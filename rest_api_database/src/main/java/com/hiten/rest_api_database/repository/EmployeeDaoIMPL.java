package com.hiten.rest_api_database.repository;

import com.hiten.rest_api_database.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoIMPL implements EmployeeDAO {

    EntityManager entityManager;


    @Autowired
    public EmployeeDaoIMPL(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query= entityManager.createQuery("FROM Employee",Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        employee.setId(0);
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public Employee update(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void delete(int id) {

        Employee employee= entityManager.find(Employee.class,id);
        entityManager.remove(employee);

    }
}
