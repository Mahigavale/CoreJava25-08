package stringBufferClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Anagram {

	public static void main(String[] args) {
		//Annagram
		String str="anna";
		String str2="aann";
		//true
		boolean lengthcheck=true;
		boolean frequency=false;
		boolean charcheck=false;
		
		char [] c1=str.toCharArray();
		char[] c2=str.toCharArray();
		 List<Character> list1= new ArrayList();
		 
		 List<Character> list2=new ArrayList();
		 for(char c: c1)
		 {
			 list1.add(c);
		 }
		 for(char c: c2)
		 {
			 list2.add(c);
		 }

		 
		 for (char c: list1)
		 {
			 if(list2.contains(c))
			 {
				 continue;
			 }
			 else
			 {
				 charcheck=false;
			 }
		 }
		 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		 
		 for(int i=0;i<list1.size();i++)
		 {
			 int counter=1;
		  for(int j=i+1; j<list1.size()-2;j++)
		  {
		  }
			 
		 }
		
	
	}

}
