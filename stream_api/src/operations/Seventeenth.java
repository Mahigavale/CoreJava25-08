package operations;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Seventeenth {

	public static void main(String[] args) {
		
	Map<String,List<String>> mp=List.of("abc","abc","cde ","jjjj","jjjj","kkkkk","kkkkk")
		 .stream().collect(Collectors.groupingBy((i)->(i)));
	System.out.println(mp);
	
	for(Entry<String, List<String>> e:mp.entrySet())
	{
		System.out.println(e.getKey()+" :"+e.getValue().size());
	}
	
	

	}

}
