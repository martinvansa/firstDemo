package com.example.firstDemo.user;

import lombok.Data;

@Data
public class User {

    String Name;
    String email;
    String mobile;
    String password;
    String role;
    String status;
    int salary;
    int bonus;

    public User(String name, String email, String mobile, String password, String role, String status) {
        Name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public User() {

    }

    public String getActualStatus() {
        return status = "Active";
    }

}
