package com.kodewala.poly.overload;

class AadharRegistration
{
	// 1. Order of the args --> String , Int --> int , String
	// 2. Number of args --> String --> String , String --> String String, String
	// 3. Type of args --> int --> String
	public void doRegistration(String mobile, int otp) // 2 param - String Int
	{
		System.out.println("AadharRegistration.doRegistration(String mobile, int otp)");
	}

	public void doRegistration(String pan, String passport) // 2 param String , String
	{
		System.out.println("AadharRegistration.doRegistration(String pan, String passport)");
	}

	public void doRegistration(String pan, String email, int otp) // 3 param String String int
	{
		System.out.println("AadharRegistration.doRegistration(String pan, String email, int otp)");
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		AadharRegistration aadharRegistration = new AadharRegistration();
		aadharRegistration.doRegistration("AOFDS342ER-PC", "GGGDGFDFGD-PP", 123);
	}

}
