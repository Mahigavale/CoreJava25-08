package functional_interfaces;

import java.util.List;
import java.util.function.Function;

public class List_int {

	public static void main(String[] args) {
	
		Function<List<Integer>, Integer> fun=(i)->{
		return i.stream().max((k,j)->{return k.compareTo(j);}).get().intValue();
		};
		
		List<Integer> list=List.of(13,56,32333,113,543,122,5544,99);
		
		System.out.println(fun.apply(list));
		/**
		 * Comparator
		 * Comparable
		 * 4 FIF
		 * 5,5 Lambda.
		 */
	}
}
