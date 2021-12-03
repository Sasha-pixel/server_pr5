package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.Employee;
import com.example.demo.businesslevel.domainlayer.Order;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.List;

public interface EmployeeService {

	List<Employee> findAll();

	void save(Employee employee);

	Employee findByName(String name);

	List<Employee> searchEmployee(String employee);

	List<Order> getAllEmployeesOrders();

	List<Employee> setWorkersToOrder(Order orderForm, List<Employee> workers);

	boolean validateEmployee(Employee employee, BindingResult bindingResult, Model model);

}
