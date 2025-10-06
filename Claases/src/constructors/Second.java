package constructors;

public class Second {

	public static void main(String[] args) {
		
		Laptop lp=new Laptop(12390);
		lp.displayprice();
		//latest value
//		lp.price=100;
//		lp.displayprice();
	}
}


class Laptop
{
	double price;
	
	
	public Laptop( double value)
	{
		displayprice();
		price=value;
		
	}
	
	public void displayprice()
	{
		if(price>500)
		{
		System.out.println("the price is :"+price);
		}
		else
		{
			System.out.println("not enough for laptop");
		}
	}
}