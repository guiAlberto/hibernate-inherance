package com.example.hibernateinheritance.joined_table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JoinedTableExample {
    
    @Autowired private AnimalRepository animalRepository;
    @Autowired private PetRepository petRepository;

    public void run() {
        var animal = new Animal();
        animal.setId(0l);
        animal.setSpecies("foo");
        animalRepository.save(animal);

        var pet = new Pet();
        pet.setId(1l);
        pet.setSpecies("foo");
        pet.setName("foo");
        petRepository.save(pet);

        log.info(animal);
        log.info(pet);

    }
}