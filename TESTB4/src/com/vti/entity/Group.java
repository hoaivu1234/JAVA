package com.vti.entity;

import java.time.LocalDate;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;
}
