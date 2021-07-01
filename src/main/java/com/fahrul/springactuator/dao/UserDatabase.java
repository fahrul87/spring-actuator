package com.fahrul.springactuator.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.fahrul.springactuator.dto.User;

@Repository
public class UserDatabase {

	public List<User> getAllUser() {
		return Stream.of(new User(108, "fahrul", "fahrul.java87@gmail.com", "active"),
				new User(109, "arka", "arka@gmail.com", "active"),
				new User(110, "azriel", "azriel@gmail.com", "inActive"),
				new User(111, "mama", "mama@gmail.com", "inActive")).collect(Collectors.toList());
	}

	public Long getUserStatusByCountByStatus(String status) {
		return getAllUser().stream().filter(user -> user.getStatus().equals(status)).count();
	}

}
