package mobigic;

public class Second {
	
	

	public static void main(String[] args) {
	
		Demo d=new Demo();
		System.out.println("Instance:");
		d.arr();
	}
	static {
		System.out.println("dello");
	}
}

class Demo
{
	
	public void arr()
	{
		 System.out.println(getint()+i);
	}
	static int i=23;
	static
	{ 
		System.out.println(i);
		System.out.println("hii");
	 System.out.println(getint());
		
		}
	
	public static int getint()
	{
		return i;
	}
	
		

}