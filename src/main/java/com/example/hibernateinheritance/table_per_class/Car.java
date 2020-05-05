package com.example.hibernateinheritance.table_per_class;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
public class Car extends Vehicle {

    private Integer numberOfDoors;
    
}