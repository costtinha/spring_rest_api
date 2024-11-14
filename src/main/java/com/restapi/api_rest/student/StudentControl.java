package com.restapi.api_rest.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentControl {
    private final StudentService repository;
    public StudentControl(StudentService repository){
        this.repository = repository;
    }


    @GetMapping("/students")
    public List<StudentResponseDto> FindStudents(){
        return repository.findAll();
    }

    @PostMapping("/students")
    public StudentResponseDto saveStudent(
            @RequestBody StudentDto dto
    ){
        return repository.save(dto);
    }
    @GetMapping("/students/{student-id}")
    public StudentResponseDto FindStudentById(
            @PathVariable("student-id") int id
    ){
        return repository.findById(id);
    }

   /* @GetMapping("/search/{student-name}")
    public List<Student> FindStudentByFirstname(
            @PathVariable("student-name") String first_name
    ){
        return repository.findAllByFirstnameContaining(first_name);
    }
    */

    @DeleteMapping("/students/{student-id}")
    public void DeleteById(
            @PathVariable("student-id") int id
    ){
        repository.deleteById(id);
    }



}
