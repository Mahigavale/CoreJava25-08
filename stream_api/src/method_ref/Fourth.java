package method_ref;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Fourth {

	public static void main(String[] args) {
		
		/**
		 * ["abba","jabba","dabba","jabba"]
		 */
		
	Map<String,List< String>> set=List.of("M","A","H","E","S","H")
		.stream()
		.collect(Collectors.groupingBy((i)->(i)));

	Map<String, Integer>mp2=new HashMap<String, Integer>();
	     for(Map.Entry<String, List<String>> mp:set.entrySet())
	     {
	    	 System.out.print(mp.getKey()+"="+mp.getValue().size()+" ");
	    	 mp2.put(mp.getKey(), mp.getValue().size());
	     }
	System.out.println(set);
	System.out.println(mp2);
	}

}
