package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "foods")
public class Food {
    
    @Id
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private Double price;
    
    @Column(nullable = false)
    private Double weight;
    
    @OneToMany(mappedBy = "food")
    private List<DailyMenu> dailyMenus;
    
    @OneToMany(mappedBy = "food")
    private List<OrderLine> orderLines;
    
    
}