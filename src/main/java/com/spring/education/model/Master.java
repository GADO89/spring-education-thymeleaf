package com.spring.education.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

//hibernate (Course -Master) #11
public class Master extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;


}
