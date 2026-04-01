package com.kodewala.exception1;

public class FinallyExp {

	public static void main(String[] args) {

		try {
			String name = null;
			System.out.println("inside try...1");
			name.length();
			System.out.println("db close connection");
			// ret 100;
		} catch (Exception e) {
			System.out.println("inside catch...");
		} finally {

			System.out.println(
					"inside finally... We do clean up activity(closing DB Connection and file connection wetc.)");

		}

	}

}
