package com.spring.education.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

//hibernate (Course -Master) #11


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Master extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Course course;


}
