package com.kodewala.interfaces.before8;

public interface  IBanking {

	public abstract void doBanking();
	
	public default void stopTxn() // this is an optional method. Introduced in java 8
	{
		System.out.println("IBanking.stopTxn()......");
	}
	
}
