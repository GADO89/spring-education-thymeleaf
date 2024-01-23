package com.spring.education.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
  //$ git commit -m "hibernate (Course Student) Closes #10"

@Entity
@Table(name ="Student" )
public class Student extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user=new User();

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;



}
