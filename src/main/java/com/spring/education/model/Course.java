package com.spring.education.model;

import java.util.List;

public class Course extends BaseEntity{
    private String courseName;
    private String coursePrice;
    private List<Student> students;
    private List<Master> masters;


}
