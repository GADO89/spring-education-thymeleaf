package com.spring.education.model;

import java.util.ArrayList;
import java.util.List;

public class Role extends BaseEntity{

    private String roleName;
    private List<User> users=new ArrayList<>();



}
