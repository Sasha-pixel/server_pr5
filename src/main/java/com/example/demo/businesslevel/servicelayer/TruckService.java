package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.Order;
import com.example.demo.businesslevel.domainlayer.Truck;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface TruckService {

	void save(Truck truck);

	List<Truck> findAllByDescription(String description);

	Truck findByCarNumber(String carNumber);

	Truck setTruckToOrder(Order orderForm, List<Truck> trucks);

	boolean validateTruck(Truck truck, BindingResult bindingResult, Model model);

}
