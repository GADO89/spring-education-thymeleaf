package com.spring.education.model;

import java.util.ArrayList;
import java.util.List;

public class User extends BaseEntity{
    private String username;
    private String password;

    private List<Role> roles=new ArrayList<>();

    private Student student= new Student();

    private Master master;

    private Admin admin;




}
