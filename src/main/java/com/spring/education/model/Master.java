package com.spring.education.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.util.Date;

public class Master extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Course course;


}
