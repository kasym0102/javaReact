package com.dto;


public class UserDelete {

    private String email;

    public UserDelete() {
    }

    public UserDelete(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
