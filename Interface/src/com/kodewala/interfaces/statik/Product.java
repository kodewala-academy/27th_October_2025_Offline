package com.kodewala.interfaces.statik;

public class Product implements Cloneable {

	 String productName;
	 String productCode;
	 String hsn;

	Product(String _productName, String _productCode, String _hsn) {
		this.productName = _productName;
		this.productCode = _productCode;
		this.hsn = _hsn;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
