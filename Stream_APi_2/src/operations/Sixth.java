package operations;

import java.util.List;
import java.util.stream.Collectors;

public class Sixth {
//	public static boolean Yash(int i)
//	{
//		//System.out.println("I recieved:"+i);
//		return i>30;
//	}
//	
//	public static void Azim(int i)
//	{
//		//System.out.println("***");
//		System.out.println(i);
//	}
//	 
//	public static int takere(int i, int j)
//	{
//		return i+j;
//	}

	public static void main(String[] args) {
		 	
		Demo_Method_ref d=new Demo_Method_ref();
  int sum= List.of(11,22,33,44,55)
  .stream()
   .filter(d::Yash)
   .reduce(0,d::takere);
   
  System.out.println(sum);
	}
}

class Demo_Method_ref
{
	public  boolean Yash(int i)
	{
		//System.out.println("I recieved:"+i);
		return i>30;
	}
	
	public  void Azim(int i)
	{
		//System.out.println("***");
		System.out.println(i);
	}
	 
	public  int takere(int i, int j)
	{
		return i+j;
	}
}


