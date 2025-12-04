package listif;

import java.util.ArrayList;
import java.util.List;

public class Seventh {

	public static void main(String[] args) {
	
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(9);
		list.add(34);
		list.add(7);
		list.add(21);
		
		System.out.println(list);
		List<Integer> list2=list.reversed();
		System.out.println(list2);
	}

}
