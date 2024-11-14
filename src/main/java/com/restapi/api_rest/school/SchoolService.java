package com.restapi.api_rest.school;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolService {
    private final SchoolRepository repository;
    private final  SchoolMapper mapper;

    public SchoolService(SchoolRepository repository, SchoolMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SchoolResponseDto> findAll(){
         return repository.findAll()
                 .stream()
                 .map(mapper::toSchoolResponseDto)
                 .collect(Collectors.toList());
    }


    public SchoolResponseDto save(SchoolDto dto){
        School school = mapper.toSchool(dto);
        repository.save(school);
        return mapper.toSchoolResponseDto(school);
    }

    public SchoolResponseDto findById(int id){
        School sc = repository.findById(id).orElse(null);
        return mapper.toSchoolResponseDto(sc);

    }

    public void deleteById(int id){
        repository.deleteById(id);
    }
}
