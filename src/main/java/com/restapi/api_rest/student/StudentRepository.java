package com.restapi.api_rest.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    //List<Student> findAllByFirstnameContaining(String firstname);
}
