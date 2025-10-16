package stringBufferClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Anagram {

	public static void main(String[] args) {
		//Annagram
		String str="anna";
		String str2="aann";
		//true
	
		 char [] c=str.toCharArray();
		 char [] c2=str2.toCharArray();
		 
		 Arrays.sort(c);
		 Arrays.sort(c2);
		 
		 System.out.println( Arrays.equals(c, c2));
 	
	}

}
