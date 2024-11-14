package com.restapi.api_rest.student;

import com.restapi.api_rest.school.School;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {


    public StudentResponseDto toStudentResponseDto(Student st){
            StudentResponseDto dto = new StudentResponseDto(st.getFirst_name(),st.getLast_name(),st.getAge(),st.getEmail());
            return dto;
    }

    public Student toStudent(StudentDto dto){
        School school = new School();
        school.setSchool_id(dto.school_id());
        Student student = new Student();
        student.setFirst_name(dto.first_name());
        student.setLast_name(dto.last_name());
        student.setAge(dto.age());
        student.setEmail(dto.email());
        student.setSchool(school);
        return student;

    }
}
