package com.hiten.jpa_hibernate;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    EntityManager entityManager;


    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    @Override
    @Transactional
    public void save(Student student) {
        System.out.println(student);

        entityManager.persist(student);

    }

    @Override
    public Student findById(int id) {
        Student student= entityManager.find(Student.class,id);
        return student;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("FROM Student",Student.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void deleteStudent(int  id) {

        Student stud=entityManager.find(Student.class,id);

         entityManager.remove(stud);

    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {

        return entityManager.merge(student) ;
    }
}
