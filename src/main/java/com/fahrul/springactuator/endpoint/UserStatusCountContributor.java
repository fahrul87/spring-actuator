package com.fahrul.springactuator.endpoint;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.fahrul.springactuator.dao.UserDatabase;

@Component
public class UserStatusCountContributor implements InfoContributor {

	@Autowired
	private UserDatabase userDatabase;

	@Override
	public void contribute(Builder builder) {
		Map<String, Long> userStatusMap = new HashMap<>();
		userStatusMap.put("active", userDatabase.getUserStatusByCountByStatus("active"));
		userStatusMap.put("inActive", userDatabase.getUserStatusByCountByStatus("inActive"));
		builder.withDetail("userStatus", userStatusMap);

	}

}
