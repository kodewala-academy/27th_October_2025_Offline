package com.kodewala.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Kodewala");
		for (int i = 0; i < 100; i++) {
			sb.append(+i);
		}
		
		System.out.println(sb);
	}

}
