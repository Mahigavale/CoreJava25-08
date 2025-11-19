package oops;

public class Poly {

	public static void main(String[] args) {
		
		/**
		 * Method Overloading and Method Overriding.
		 */
		
		Calculator calc=new Calculator();
		
		calc.add(12, 33, 56);
	}

}

class Calculator
{
	
	
	public Calculator()
	{
		
	}
	public Calculator(int i)
	{
		
	}
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public int add(int i, int j,int k)
	{
		//System.out.println(i+j+k);
		return i+j+k;
	}
	
	
	public void add(double d, double d2)
	{
		System.out.println(d+d2);
	}
}