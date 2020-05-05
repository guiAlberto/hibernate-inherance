package com.example.hibernateinheritance.mapped_superclass;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public class Person {
    
    @Id
    private Long personId;
    private String name;
}