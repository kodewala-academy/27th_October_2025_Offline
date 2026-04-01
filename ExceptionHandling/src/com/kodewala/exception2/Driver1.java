package com.kodewala.exception2;

import java.io.FileInputStream;

public class Driver1 {

	public static void main(String[] args) {
         
		try(FileInputStream fis = new FileInputStream("order.xml")) // try with resources
		{
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			// close the fis connection
		}
		
	}
}
