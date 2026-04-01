package com.kodewala.list.set;

import java.util.TreeSet;

class Account implements Comparable {
	String accountHolderName;

	public Account(String _accountHolderName) {

		this.accountHolderName = _accountHolderName;
	}

	@Override
	public int compareTo(Object o) { // -ve(small) zero(same) +ve(big)
		Account acc = (Account) o;
		return this.accountHolderName.compareTo(acc.accountHolderName);
	}

}

public class TreeSetExp {

	public static void main(String[] args) {

		TreeSet<Account> ts = new TreeSet<Account>();
		Account acc1 = new Account("kodewala");
		Account acc2 = new Account("kapil");
		Account acc3 = new Account("nayandeep");
		Account acc4 = new Account("ajay");
		ts.add(acc1);
		ts.add(acc2);
		ts.add(acc3);
		ts.add(acc4);
		for (Account account : ts) {
			System.out.println(account.accountHolderName);
		}
	}

}
