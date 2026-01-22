package operations;

import java.util.List;

public class First {

	
	public static void main(String[] args) {
		
		List.of(13,13,12,12,45,45,45,67,67,67)
		.stream()
		.distinct()
		.peek((j)->{System.out.println("From peeK"+j);})
		.sorted((i,j)->{return Integer.compare(j, i);})
		.map((i)->{ return i+1+"A";})
		.forEach((i)->{
			System.out.println(i);
		});

	}

}
