package inheritance;

public class Daimond {

	public static void main(String[] args) {
		
		Mahindra mahindra=new Mahindra();
		
	 System.out.println(mahindra.weight);
		
	}

}

class Truck
{
	String weight ="12 tonnes";
}

class Cab
{
	String weight ="3 tonnes";
}

class Mahindra extends Truck, Cab
{
	
}