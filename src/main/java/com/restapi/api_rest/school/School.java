package com.restapi.api_rest.school;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.restapi.api_rest.student.Student;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {
    @Id
    @GeneratedValue
    private int school_id;
    @Column(
            length = 80,
            name= "school_name"
    )
    private String SchoolName;
    private String school_address;

    @OneToMany(
            mappedBy = "school"
    )
    @JsonManagedReference
    private List<Student> students;



    public School(int school_id, String school_name, String school_address) {
        this.school_id = school_id;
        this.SchoolName = school_name;
        this.school_address = school_address;
    }



    public School() {
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String school_name) {
        this.SchoolName = school_name;
    }

    public String getSchool_address() {
        return school_address;
    }

    public void setSchool_address(String school_address) {
        this.school_address = school_address;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }





}
