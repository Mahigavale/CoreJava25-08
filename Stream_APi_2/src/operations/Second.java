package operations;

import java.util.List;

public class Second {

	public static void main(String[] args) {
		
		List<Integer> list=null;
		               list=List.of(10,12);
		List<String> list2=null;
		             list2=List.of("a","b");
		

		 System.out.println(list.getClass().equals(list2.getClass()));
	
	}

}
