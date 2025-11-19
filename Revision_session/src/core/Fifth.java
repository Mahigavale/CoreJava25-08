package core;

public class Fifth {

	public static void main(String[] args) {
		
		String str="ABC";
		
		String str2="ABC";
		
		
		
		String str3=new String("CDE");
		
		String str4="CDE";
		
		System.out.println(str3.intern()==str4);

	}

}
