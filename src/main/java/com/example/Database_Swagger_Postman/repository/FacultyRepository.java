package com.example.Database_Swagger_Postman.repository;

import com.example.Database_Swagger_Postman.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}
