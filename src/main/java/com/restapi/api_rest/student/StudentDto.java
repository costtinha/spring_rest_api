package com.restapi.api_rest.student;

public record StudentDto(
        String first_name,
        String last_name,
        int age,
        String email,
        Integer school_id
) {
}
