package com.kodewala.banking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account(1000, "kapil", "Bank123");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("account.ser");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(account); // Writing the account abject ot file(account.ser)

			// De- Serialization
			FileInputStream fis = new FileInputStream("account.ser");
			ObjectInput ois = new ObjectInputStream(fis);
			Account accSer = (Account) ois.readObject();

			System.out.println(accSer.amount + " " + accSer.bankCode);
		}

		catch (Exception e) {

			e.printStackTrace();
		}

	}

}
