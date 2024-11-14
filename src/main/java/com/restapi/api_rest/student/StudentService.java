package com.restapi.api_rest.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper mapper;
    public StudentService(StudentRepository repository,StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<StudentResponseDto> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::toStudentResponseDto)
                .collect(Collectors.toList());

    }

    public StudentResponseDto save(StudentDto dto){
        Student st = mapper.toStudent(dto);
        repository.save(st);
        return mapper.toStudentResponseDto(st);
    }

    public StudentResponseDto findById(int id){
        Student st =repository.findById(id).orElse(null);
        return mapper.toStudentResponseDto(st);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }
}
