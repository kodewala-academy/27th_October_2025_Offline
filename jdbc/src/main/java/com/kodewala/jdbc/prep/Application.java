package com.kodewala.jdbc.prep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

public class Application {
	public static void main(String[] args) {
		System.out.println("Application.main()");

		// load jdbc driver
		try {
			// load jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/27th_oct_batch", "root",
					"Test@12345");

			String sql = "insert into user_info(user_name, user_id,status) values(?, ?, ?)";
			// create statement
			PreparedStatement ps = con.prepareStatement(sql);

			int batchSize = 500;

			for (int i = 1; i < 10000; i++) { // 100 times
				ps.setString(1, "agnish1" + i);
				ps.setString(2, "agni@" + i);
				ps.setString(3, "CREATED");
				ps.addBatch();
				System.out.println("adding to batch!");
				if (i % batchSize == 0) {
					System.out.println(" Executing the batch of " + i);
					ps.executeBatch();
				}

			}
			System.out.println(" Executing remaining!!");
			ps.executeBatch();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
