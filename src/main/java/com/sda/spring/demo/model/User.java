package com.sda.spring.demo.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "user_id")
    private Long id;
    private String firstname;
    private String lastname;
    private String password;
    @Column(unique = true)
    private String nick;
    private String address;
    private String city;
    private String postalcode;
    private String telephone;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Role role;



}
