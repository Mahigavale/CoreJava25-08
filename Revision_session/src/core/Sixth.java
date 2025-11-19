package core;

import java.util.Arrays;

public class Sixth {

	public static void main(String[] args) {
		
		
		String str="ANNA";
		String str2="NANA";
		
		char [] first=str.toCharArray();
		
		Arrays.sort(first);
		
		char[] second=str2.toCharArray();
		Arrays.sort(second);
		
		System.out.println(first);
 System.out.println(second);		
		System.out.println( Arrays.equals(first, second));
		
	}

}
