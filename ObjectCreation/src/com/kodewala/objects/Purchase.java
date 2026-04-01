package com.kodewala.objects;

public class Purchase extends Invoice {
     
	Purchase(String item)
	{
		this(item, 120000); // it will call super class no arg constructor.
	}
	
	Purchase(String item, int price)
	{
	  super(" iphone"); // Object class default constructor	
	  System.out.println("Purchase.Purchase()");
	}
	public static void main(String[] args) {
		
		Purchase purchase = new Purchase("iPhone");
		
        System.out.println(purchase.hashCode());
        
	} 

}
