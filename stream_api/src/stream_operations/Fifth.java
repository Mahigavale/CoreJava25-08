package stream_operations;

import java.util.Comparator;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		
	 
		List.of(3,5,23,1,3,34,21)
		.stream()
		.sorted((i,j)->{return Integer.compare(j, i);})
		.forEach((i)->{System.out.println(i);});
	
		
		
	}
}
