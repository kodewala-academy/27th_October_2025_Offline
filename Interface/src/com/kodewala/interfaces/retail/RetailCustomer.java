package com.kodewala.interfaces.retail;

import com.kodewala.interfaces.ICustomer;

public class RetailCustomer implements ICustomer {

	@Override
	public void addCustomer(String name) {
		// How
		System.out.println("RetailCustomer: adding Retail customer....");
	}

	@Override
	public void updateCustomer(String name) {
		// How
		System.out.println("RetailCustomer: updating Retail customer....");
	}

	@Override
	public void deleteCustomer(String name) {
		// How
		System.out.println("RetailCustomer: deleting Retail customer....");
	}

	@Override
	public void suspendCustomer(String name) {
		// TODO Auto-generated method stub
		
	}
}
