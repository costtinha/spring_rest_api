package com.restapi.api_rest.school;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolControl {
    private final SchoolService repository;

    public SchoolControl(SchoolService repository){
        this.repository = repository;
    }


    @GetMapping("/schools")
    public List<SchoolResponseDto> FindSchools(){
        return repository.findAll();
    }

    @PostMapping("/schools")
    public SchoolResponseDto SaveSchool(
            @RequestBody SchoolDto dto
    ){
        return repository.save(dto);
    }

    @GetMapping("/school/{school-id}")
    public SchoolResponseDto FindSchoolById(
            @PathVariable("school-id") int id
    ){
        return repository.findById(id);
    }

    /*@GetMapping("/school/search/{school-name")
    public List<School> FindSchoolByName(
            @PathVariable("school-name") String name
    ){
        return repository.findAllBySchoolNameContaining(name);
    }
     */
    @DeleteMapping("/school/{school-id}")
    public void DeleteSchoolById(
            @PathVariable("school-id") int id
    ){
        repository.deleteById(id);
    }
}
