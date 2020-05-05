package com.example.hibernateinheritance;

import com.example.hibernateinheritance.table_per_class.TablePerClassExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}

	@Autowired
	private TablePerClassExample example;

	@Override
	public void run(String... args) throws Exception {
		example.run();
	}

}
