package com.example.hibernateinheritance.single_table;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
public class Pen extends MyProduct {

    private String color;

}