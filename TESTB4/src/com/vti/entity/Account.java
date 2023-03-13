package com.vti.entity;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String username;
    private String fullname;
    private Department department;
    private Position position;
    private LocalDate createDate;
    private Group[] groups;
}
