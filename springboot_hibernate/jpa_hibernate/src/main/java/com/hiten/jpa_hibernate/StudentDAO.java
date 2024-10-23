package com.hiten.jpa_hibernate;


import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    public Student findById(int id);
    public List<Student> findAll();

    public  void deleteStudent(int id);

    public Student updateStudent(Student student);
}
