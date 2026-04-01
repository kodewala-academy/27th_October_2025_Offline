package com.kodewala.interfaces.dp;

public interface IMessage {

	void display();

	default void print() {
		System.out.println("IMessage.print()");
	}
}
