package com.example.hibernateinheritance.single_table;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepository extends JpaRepository<Pen, Long> {
    
}