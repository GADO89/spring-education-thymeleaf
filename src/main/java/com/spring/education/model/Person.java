package com.spring.education.model;

import com.spring.education.model.enums.Gender;
import jakarta.persistence.Column;

import java.util.Date;

public class Person extends Boy{

    @Column(name = "age")
    private String age;
    @Column(name = "address")
    private String address;
    @Column(name = "date")
    private Date date;
    @Column(name = "gender")
    private Gender gender;
    @Column(name = "dateCreated")
    private Date dateCreated;
    @Column(name = "lastUpdated")
    private Date lastUpdated;



}
