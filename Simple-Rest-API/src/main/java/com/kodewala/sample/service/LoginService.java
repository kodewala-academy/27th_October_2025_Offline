package com.kodewala.sample.service;

import org.springframework.stereotype.Service;

import com.kodewala.sample.exception.UserNotFoundException;

@Service
public class LoginService {

	public boolean login(String user, String password) {
		System.out.println("LoginService.login() " + user + " and " + password);
		// call to repo

		boolean isExists = checkUserWithDB(user, password);

		if (!isExists) {
			throw new UserNotFoundException("User " + user + " not found");
		}

		return isExists;
	}

	private boolean checkUserWithDB(String user, String password) {
		return false;
	}

}
