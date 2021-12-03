package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.User;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AuthorizationService {

	String encode(String password);

	boolean matches(String rawPassword, String oldPassword);

	String checkAuthority(String error, User user, Model model, HttpServletRequest request);

	String getMainPage(User user, Model model);

	String save(User user, BindingResult bindingResult, Model model);

	String updatePassword(User user);

	User findByUsername(String username);

	User findByEmail(String email);

	User findByPhoneNumber(String phoneNumber);

	void createCookie(HttpServletResponse httpServletResponse);

	void pasteUserForm(User userForm, Model model);

	boolean validateUserForm(User userForm, BindingResult bindingResult, Model model);

	boolean activateUser(String code);

	String changingPassword(String oldPassword, String newPassword, Model model);

	String forgetPasswordAction(User user, String email, Model model);

	String resetPasswordAction(User user, String token, String password, Model model);

}
