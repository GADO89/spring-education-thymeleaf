package com.spring.education.model;

//   create models #1

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

////////////////////editing models #3
@MappedSuperclass
public class Boy extends BaseEntity{

    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    @Column(name = "phone")
    private String phone;


}
