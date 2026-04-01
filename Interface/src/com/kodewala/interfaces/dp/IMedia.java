package com.kodewala.interfaces.dp;

public interface IMedia {
	void display();

	default void print() {
		System.out.println("IMedia.print()");
	}
}
