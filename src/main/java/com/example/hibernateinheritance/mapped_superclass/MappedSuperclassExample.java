package com.example.hibernateinheritance.mapped_superclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class MappedSuperclassExample {

    @Autowired
    private MyEmployeeRepository myEmployeeRepository;
    
    public void run() {
        var myEmployee = new MyEmployee();
        myEmployee.setPersonId(0l);
        myEmployee.setName("foo");
        myEmployee.setCompany("foo");
        myEmployeeRepository.save(myEmployee);
        log.info(myEmployee);
    }
}