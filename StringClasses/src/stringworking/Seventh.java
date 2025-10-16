package stringworking;

public class Seventh {

	
	public static void main(String args[])
	{
		
		String str="anna";
		
		String str2=new String("anna_1");
		
		String str3=str2.intern(); // POOL 
		
		String str4="anna_1";
		
		
		//unique literals
		//System.out.println(str==str2);
		System.out.println(str==str3);
		
		System.out.println("******************************");
		
		System.out.println(str3==str4);
		//heap => str2
		//scp=> "anna", "anna_1"
		
		
		
		StringBuffer sb=new StringBuffer("ddee");
		
	
	}
}
