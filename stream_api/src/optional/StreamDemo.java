package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo {

	public static void main(String[] args) {
		
	Optional<Integer>op=List.of(11,17,21,76,19,34).stream()
		.min((i,j)->(Integer.compare(i, j)));

	
	System.out.println(op.get());
	
	 List<Integer> list=new ArrayList<Integer>();
	 list.add(23);	 list.add(25);
	 //list.add(null);
	
	 Optional <Integer> sum=list.stream()
	.reduce((i,j)->(i+j));
	sum.ifPresentOrElse(System.out::println, ()->{System.out.println("empty list");});
	}

}
