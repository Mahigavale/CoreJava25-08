package queueif;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Third {

	public static void main(String[] args) {
	
	
		//Mahesh=>{M=1,a=1,h=2,e=1,s=1}
		//nandKishor=>{n=2,a=1,d=1,k=1,i=1,s=1,h=1,o=1,r=1}
		
		//containskey, get 
		String str="aaabbcccnull";
		
		                char[] chars =str.toCharArray();
		  Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		  
		  //aaabbccc   //{a=2,
		  for(char c:chars)
		  {
			    int frequency=1;
			    if(map.containsKey(c))
			    {
			    	 frequency=map.get(c)+1;
			    }
			    map.put(c, frequency);
		  }
		  
		  System.out.println(map);
		
	
		
		
		
		
		
		
	}
}
