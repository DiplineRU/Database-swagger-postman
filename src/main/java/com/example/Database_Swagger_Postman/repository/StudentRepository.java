package com.example.Database_Swagger_Postman.repository;

import com.example.Database_Swagger_Postman.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}