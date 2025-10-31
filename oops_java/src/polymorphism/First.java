package polymorphism;

public class First {

	public static void main(String[] args) {
		
		Aeroplane aero=new Aeroplane(1);
		
		/**
		 * How many parameters I am passing.
		 */
		
		/**
		 * 12 will be output
		 */
		/**
		 * AT the compile time only you will have the call fixed.
		 * that which fly() method we want to call.
		 */
		 System.out.println(aero.fly(12,"ab"));

	}
}


class Aeroplane
{
	
	
	/**
	 * Constructor Overloading.
	 */
	public Aeroplane()
	{
		System.out.println(":okjomol");
		
	}
	
	public Aeroplane(int i)
	{
		System.out.println("Integer const.");
	}
	/**
	 * Method Overloading/Static /Compile time Polymorphism.
	 * @param i
	 */
	/**
	 * YOu have to match the method signature.
	 * number of parameters ,
	 * type of parameters,
	 * sequence of parameters.
	 * @param st
	 */
	
	public int fly(int i,String st)
	{
		
		return 12;
	}
	
	public void fly(String st,int i)
	{
		System.out.println("B");
	}
	
	public void fly(int i, int j, int k)
	{
		
		System.out.println("C");
	}
	public int run(double d)
	{
		return 1;
	}
	
	public double run(double d,int i)
	{
		return 1.0;
	}
}