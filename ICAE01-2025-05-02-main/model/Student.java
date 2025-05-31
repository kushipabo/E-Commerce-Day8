package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student extends Person {
	@Id
	private int id;
    
    @Column(name = "academic_degree")
    private String academicDegree;
    
    @OneToMany(mappedBy = "student")
    private Set<FoodOrder> foodOrders ;
    
}