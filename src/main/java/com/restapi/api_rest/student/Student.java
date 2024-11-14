package com.restapi.api_rest.student;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.restapi.api_rest.school.School;
import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column(
            name="f_name",
            length = 25
    )
    private String first_name;
    @Column(
            name = "l_name",
            length = 250
    )
    private String last_name;
    private int age;
    @Column(
            unique = true
    )
    private String email;



    @ManyToOne
    @JoinColumn(
            name = "school_id"
    )
    @JsonBackReference
    private School school;

    public Student() {
    }

    public Student(int id, String first_name, String last_name, int age, String email,School school) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.email = email;
        this.school = school;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
