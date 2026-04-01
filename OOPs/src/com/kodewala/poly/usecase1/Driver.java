package com.kodewala.poly.usecase1;

sealed class Bank permits HDFC , IDFC
{

}

 final class HDFC extends Bank
{

}

final class IDFC extends Bank
{

}

class XYZ extends Bank
{

}

public class Driver
{

	public static void main(String[] args)
	{

	}
}
