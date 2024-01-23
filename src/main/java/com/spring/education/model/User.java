package com.spring.education.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity(name = "user")
public class User extends BaseEntity{
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<Role> roles=new ArrayList<>();

    private Student student= new Student();

    private Master master=new Master();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Admin admin=new Admin();




}
