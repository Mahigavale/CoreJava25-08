package core;

public class Third {

	public static void main(String[] args) {
		
	
		/**
		 * SCP => String constant pool.
		 * Java 7=> Optimization , Performance, Efficiency.
		 *String Interning
		 */
		
		//== =>Memory address.
		String str="ABC";
		
		String str2=new String("ABC"); //Object
		
		String str3="ABC";
		
		
		System.out.println(str==str2);
	}

}

