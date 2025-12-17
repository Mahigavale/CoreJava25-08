package setif;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Logical {

	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		
		
	
		set.add(13);
		set.add(24);
		set.add(45);
		set.add(20);
		
		List<Integer> list=new ArrayList<Integer>()
;
		System.out.println("set:"+set);

	
		
		
		list.add(45);
		list.add(24);
		
		System.out.println("List:"+list);
		//System.out.println(set.add(11));
		set.retainAll(list);
		
		
		System.out.println("retained Set:"+set);

	}

}
