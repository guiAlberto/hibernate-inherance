package com.example.hibernateinheritance.joined_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name = "petId")
public class Pet extends Animal {

    private String name;

}