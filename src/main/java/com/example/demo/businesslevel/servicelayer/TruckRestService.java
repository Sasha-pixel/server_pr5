package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.Truck;

import java.util.List;

public interface TruckRestService {

	void addNewTruck(Truck truck);

	List<Truck> getAllTrucks();

	Truck getTruck(Long id);

	Truck updateTruck(Long id, Truck truck);

	void deleteTruck(Long id);

}
