package com.example.hibernateinheritance.single_table;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
public class Book extends MyProduct {

    private String author;
    
}