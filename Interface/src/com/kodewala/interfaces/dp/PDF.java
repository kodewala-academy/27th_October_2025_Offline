package com.kodewala.interfaces.dp;

public class PDF implements IMessage, IMedia {

	@Override
	public void print() {
		
		IMessage.super.print(); // 100%
	}

	@Override
	public void display() {
		
		
	}

}
