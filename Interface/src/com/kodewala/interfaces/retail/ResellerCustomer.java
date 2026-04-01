package com.kodewala.interfaces.retail;

import com.kodewala.interfaces.ICustomer;

public class ResellerCustomer implements ICustomer {

	@Override
	public void addCustomer(String name) {
		// How
		System.out.println("ResellerCustomer: adding Reseller customer....");
	}

	@Override
	public void updateCustomer(String name) {
		// How
		System.out.println("ResellerCustomer: updating Reseller customer....");
	}

	@Override
	public void deleteCustomer(String name) {
		// How
		System.out.println("ResellerCustomer: deleting Reseller customer....");
	}

	@Override
	public void suspendCustomer(String name) {
		// TODO Auto-generated method stub
		
	}
}
