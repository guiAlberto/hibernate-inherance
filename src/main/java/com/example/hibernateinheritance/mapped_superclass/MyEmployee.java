package com.example.hibernateinheritance.mapped_superclass;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(callSuper = true)
public class MyEmployee extends Person {
    private String company;
}