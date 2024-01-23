package com.spring.education.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//   create models #1

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "admin")
public class Admin extends Boy{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;



}
