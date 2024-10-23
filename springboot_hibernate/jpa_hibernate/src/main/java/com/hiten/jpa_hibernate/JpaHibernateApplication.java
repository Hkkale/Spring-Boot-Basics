package com.hiten.jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaHibernateApplication {
	StudentDAO studentDAO;

	@Autowired
	public JpaHibernateApplication(StudentDAO studentDAO){
		this.studentDAO=studentDAO;

	}

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateApplication.class, args);



	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner ->{
			deleteStudent();
		};
	}

	public void save(){
		Student bala= new Student("Anshul", "kale", "Anshul@gmail.com");
		System.out.println("Data is saving");

		studentDAO.save(bala);
	}

	public void readData(){
		Student student = studentDAO.findById(2);
		System.out.println(student);
	}


	public void getAllStudents(){
		List<Student> students=studentDAO.findAll();
		students.forEach(student -> System.out.println(student));
	}

	public void updateStudent(){
		Student student = studentDAO.findById(4);
		student.setFirstName("Sonal");
		student.setEmail("sonal@gmail.com");


		Student updatedStud = studentDAO.updateStudent(student);
		System.out.println(updatedStud);
	}

	public void deleteStudent(){

		studentDAO.deleteStudent(4);
		System.out.println("Deleted Successfully id ="+ 4);



	}



}
