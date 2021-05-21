package com.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "email", nullable = false)
    private String email;
    private String password;
    private String name;
    private boolean gender;
    private Date dob;
    private int phone_first3;
    private int phone_rest;
    private String profil_pic;
    @Column(name = "is_admin")
    private boolean admin;


}
