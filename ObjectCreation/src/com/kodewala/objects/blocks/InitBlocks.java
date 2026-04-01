package com.kodewala.objects.blocks;

public class InitBlocks {

	// 1st Static Init block (SIB)

	static {
		// will get executed only one per class loading.
		// common activity for all the objects.
		// i.e - database connections , file connection, some initialization
		System.out.println(" Inside SIB1");
	}

	// IIB
	{
		System.out.println(" inside IIB");
	}

	InitBlocks() {
		// either super or this. super();
		// call to IIB
		System.out.println(" Inside Constructor");
		// this.id=_id;
		//this.name=_name;
	}

	public static void main(String[] args) {
		System.out.println(" inside main()");

		InitBlocks blocks = new InitBlocks();
	}
}
