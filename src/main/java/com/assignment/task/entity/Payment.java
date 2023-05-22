package com.assignment.task.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    
    private String method; 
    private Integer amount;
    private String order_id; 
    private String order_name; 
    private String success_url; 
    private String fail_url;
}
