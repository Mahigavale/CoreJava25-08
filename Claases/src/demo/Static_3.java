package demo;

public class Static_3 {

	public static void main(String[] args) {

		Shahar A=new Shahar();
		A.name="Latur";
		A.pincode="143143";
		
		Shahar B=new Shahar();
		B.name="Beed";
		B.pincode="431517";
		
		A.showdetails();
		B.showdetails();
		
//		A.demo();
//		B.demo();
//		Shahar.demo();
//		
	}
}

class Shahar
{
	
	String name;
	String pincode;
	 final String state="Maharashtra";
	
	public void showdetails()
	{
		System.out.println(name);
		System.out.println(pincode);
		System.out.println(state);
	}
	
	public static void demo()
	{
		System.out.println("demo from the Shahar");
	}
}