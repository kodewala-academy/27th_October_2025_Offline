package com.kodewala.objects.blocks;

public class HotStarUsers {

	static int userCount = 0;

	HotStarUsers(String userType, String exp, String socialMedia, String geo) {

	}

	HotStarUsers() {

	}

	HotStarUsers(String sourceType) {

	}

	HotStarUsers(String userType, String exp) {

	}

	HotStarUsers(String userType, String exp, String geo) {

	}

	{
		userCount++; // common activity required to be executed for all the object creation
	}

	public static void main(String[] args) {

		HotStarUsers u1 = new HotStarUsers();
		HotStarUsers u2 = new HotStarUsers("TV");
		HotStarUsers u3 = new HotStarUsers("Paid", "10/12/2025");

		HotStarUsers u4 = new HotStarUsers();
		HotStarUsers u5 = new HotStarUsers();
		HotStarUsers u6 = new HotStarUsers("App");

		HotStarUsers u7 = new HotStarUsers("App");
		HotStarUsers u8 = new HotStarUsers();
		HotStarUsers u9 = new HotStarUsers("Paid", "28/11/2025");
		// HotStarUsers u10 = new HotStarUsers();

		HotStarUsers u10 = new HotStarUsers("Paid", "28/11/2025", "EU");
		HotStarUsers u11 = new HotStarUsers("Paid", "28/11/2026", "EU");
		HotStarUsers u12 = new HotStarUsers("Paid", "28/11/2026", "EU", "YT");

		System.out.println(" Total live viewers are : " + userCount);
	}

}
