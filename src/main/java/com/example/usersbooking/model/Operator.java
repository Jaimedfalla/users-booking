package com.example.usersbooking.model;

import com.example.usersbooking.utils.dto.OperatorDto;
import com.example.usersbooking.utils.enums.Rol;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCrypt;
import java.util.*;

@Document
public class Operator {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String passwordHash;
    private List<Rol> roles;
    private Date createdAt;

    public Operator(){}

    public Operator(OperatorDto operator){
        this.setValues(operator);
        this.createdAt = new Date();
        this.roles = new ArrayList<>(Collections.singleton(Rol.USER));
    }

    public void Update(OperatorDto operator){

        this.setValues(operator);
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() { return passwordHash; }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    private void setValues(OperatorDto operator){
        this.name = operator.getName();
        this.lastName = operator.getLastName();
        this.email = operator.getEmail();
        this.passwordHash = BCrypt.hashpw(operator.getPassword(),BCrypt.gensalt());
    }
}
