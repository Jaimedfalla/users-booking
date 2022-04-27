package com.example.usersbooking.utils.dto;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class OperatorResponseDto {

    private String name;
    private String lastName;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}
