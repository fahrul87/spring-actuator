package com.fahrul.springactuator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springactuator.dao.UserDatabase;
import com.fahrul.springactuator.dto.User;

@RestController
public class UserController {

	@Autowired
	private UserDatabase userDatabase;

	@GetMapping("/loadUsers")
	public List<User> getUsers() {
		return userDatabase.getAllUser();
	}

}
