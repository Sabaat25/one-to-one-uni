package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleRegistration { 
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sabaat");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction(); 
    
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Car");
    vehicle.setManufacturer("Toyota");
    vehicle.setModel("Supra mk15");
    vehicle.setYear(2023);
    vehicle.setColor("White");

    Registration registration = new Registration();
    registration.setRegistrationNumber("MH-0607");
    registration.setRegistrationState("Maharashta");
    registration.setOwnerName("SabaatTungekar"); 
	vehicle.setRegistration(registration);

	entityTransaction.begin(); 
	entityManager.persist(vehicle); 
	entityManager.persist(registration);
	entityTransaction.commit(); 
	
	}
}
