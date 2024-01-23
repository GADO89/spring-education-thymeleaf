package com.spring.education.model;

//   create models #1

import jakarta.persistence.Column;

////////////////////editing models #3
public class Boy extends BaseEntity{

    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "phone")
    private String phone;


}
