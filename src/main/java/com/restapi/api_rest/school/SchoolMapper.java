package com.restapi.api_rest.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public SchoolResponseDto toSchoolResponseDto(School school){
        SchoolResponseDto dto = new SchoolResponseDto(school.getSchoolName(), school.getSchool_address());
        return dto;
    }

    public  School toSchool(SchoolDto dto){
        School school = new School();
        school.setSchoolName(dto.SchoolName());
        school.setSchool_address(dto.school_address());
        return school;
    }
}
