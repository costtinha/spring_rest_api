package com.restapi.api_rest.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {

    //List<School> findAllBySchoolNameContaining(String SchoolName);
}
