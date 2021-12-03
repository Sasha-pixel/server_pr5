package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.Employee;
import com.example.demo.businesslevel.domainlayer.Order;
import com.example.demo.businesslevel.domainlayer.Truck;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface OrderService {

	void save(Order order);

	List<Order> findAll();

	List<Order> findAllByCustomerUsername(String customerUsername);

	void delete(Long id);

	List<Order> findAllByOrderByCustomerUsername();

	void pasteOrderForm(Order orderForm, int numberOfWorkers, Model model);

	boolean validateOrderForm(Order orderForm, List<Employee> workersBuf,
							  int numberOfWorkers, Truck truck,
							  BindingResult bindingResult, Model model);

	List<Order> searchOrdersByUsername(String username);
}
