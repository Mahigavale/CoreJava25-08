package core;

public class Fourth {

	public static void main(String[] args) {
		
		String str="DEMO";
		
		
		String str2=new String("MEMO");
		
		
		String str3="MEMO";
		
	//	System.out.println(str2.intern()==str3);
		
		String str4=new String("MEMO");
		
		System.out.println((str4.intern()==str3)&&(str4.intern()==str2.intern()));

	}

}
