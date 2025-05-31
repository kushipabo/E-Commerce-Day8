package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "canteens")
public class Canteen {
    
    @Id
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String location;
    
    @OneToMany(mappedBy = "canteen")
    private List<DailyMenu> dailyMenus;
    
    @ManyToMany(mappedBy = "canteens")
    private List<Employee> employees;
    
}