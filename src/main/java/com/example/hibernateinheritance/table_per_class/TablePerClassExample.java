package com.example.hibernateinheritance.table_per_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class TablePerClassExample {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private CarRepository carRepository;

    public void run() {
        var vehicle = new Vehicle();
        vehicle.setVehicleId(0l);
        vehicle.setManufacturer("foo");
        vehicleRepository.save(vehicle);
        log.info(vehicle);

        var car = new Car();
        car.setVehicleId(1l);
        car.setManufacturer("foo");
        car.setNumberOfDoors(5);
        carRepository.save(car);
        log.info(car);

    }

}
