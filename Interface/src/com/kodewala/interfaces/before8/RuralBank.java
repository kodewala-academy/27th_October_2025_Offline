package com.kodewala.interfaces.before8;

public class RuralBank implements IBanking {

	@Override
	public void doBanking() {

	}

	@Override
	public void stopTxn() {
    System.out.println("RuralBank.stopTxn().........");
	}

}
