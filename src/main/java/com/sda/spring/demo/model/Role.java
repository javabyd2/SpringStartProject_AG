package com.sda.spring.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "role_id")
    private Long id;
    @Column(unique = true)
    private String name;
    private Long userId;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<User> users;


}