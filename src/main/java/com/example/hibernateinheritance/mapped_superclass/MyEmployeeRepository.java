package com.example.hibernateinheritance.mapped_superclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEmployeeRepository extends JpaRepository<MyEmployee, Long> {

}
