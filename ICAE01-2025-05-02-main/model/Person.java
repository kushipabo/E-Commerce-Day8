package com.example.demo.model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Person {
     
    private String name;
    private Integer age;
    private String gender;
    
    
}