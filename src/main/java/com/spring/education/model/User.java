package com.spring.education.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class User extends BaseEntity{

    @Column(name = "user_name", unique = true)
    private String username;
    @Column(name = "password")
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
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy ="" )
    private Student student= new Student();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy ="" )
    private Master master=new Master();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Admin admin=new Admin();




}
