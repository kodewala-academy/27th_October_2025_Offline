package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Payment {

	@Value("12000")
	private int amount;
	@Value("ID1234")
	private String paymentId;
	@Value("PAID")
	private String status;

	public int getAmount() {
		return amount;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public String getStatus() {
		return status;
	}

	public void printInfo() {
		System.out.println(" payment id : " + paymentId + " amount : " + amount + " and status " + status);
	}

}
