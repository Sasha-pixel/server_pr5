package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.Employee;
import com.example.demo.businesslevel.domainlayer.Truck;
import com.example.demo.businesslevel.domainlayer.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

public interface AdminService {

	String getAdminPage(User user, Model model);

	void checkUserActivationCode(User user, Model model);

	String searchUsers(String username, Model model);

	String checkEmployees(String employee, Model model);

	String addingCar(Truck truck, User user, BindingResult bindingResult, Model model);

	String addingEmployee(Employee employee, User user, BindingResult bindingResult, Model model);


}
