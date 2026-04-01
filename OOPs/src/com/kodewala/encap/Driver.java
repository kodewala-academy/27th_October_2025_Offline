package com.kodewala.encap;
 // 
class Order { // variable(data) should be private

	private int orderId; // Declaring variable as private
	private String itemName; // Declaring variable as private

	// reading 
	public int getOrderId() {
		return orderId;
	}

	// modification 
	public void setOrderId(int orderId) {
		if (orderId > 0) { // access...
			this.orderId = orderId;
		}

	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}

public class Driver {

	public static void main(String[] args) {
		Order order = new Order();
		//order.orderId = -5234534;
		 // modifying the value 
		 order.setOrderId(-100234);
		 // reading the value..
		System.out.println(order.getOrderId());
	}
}
