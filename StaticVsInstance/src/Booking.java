
public class Booking { // yatra.com --> 10k p/m

	static int gst = 18; // gst is same for all the objects.
	int amount; // specific to each object/customer
	String name;
	Booking(int _amount, String _name)
	{
		this.amount=_amount;
		this.name=_name;
	}
	
	public static void main(String[] args) {

		Booking obj1 = new Booking(5000,"kapil");
		Booking obj2 = new Booking(120000, "gaurav");
		
		System.out.println("");

	}

}
