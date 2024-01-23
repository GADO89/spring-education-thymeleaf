package com.spring.education.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.List;

public class Student extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user=new User();


    private List<Course> courses;



}
