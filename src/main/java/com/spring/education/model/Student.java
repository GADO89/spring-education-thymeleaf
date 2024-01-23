package com.spring.education.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
  //$ git commit -m "hibernate (Course Student) Closes #10"

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Student" )
public class Student extends Person{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user=new User();

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;



}
