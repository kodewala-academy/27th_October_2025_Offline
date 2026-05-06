package com.kodewala.sample.exception;

public class UserNotFoundException extends RuntimeException
{
	public UserNotFoundException(String message)
	{
		super(message);
	}
}
