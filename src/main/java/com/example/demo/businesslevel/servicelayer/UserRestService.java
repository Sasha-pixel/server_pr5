package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.User;

import java.util.List;

public interface UserRestService {

	void addNewUser(User user);

	List<User> getAllUsers();

	User getUser(Long id);

	User updateUser(Long id, User user);

	void deleteUser(Long id);

}
