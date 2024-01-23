package com.spring.education.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "course")
public class Course extends BaseEntity{
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_price")
    private String coursePrice;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_course",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "student_id")}
    )
    private List<Student> students;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    private List<Master> masters;


}
