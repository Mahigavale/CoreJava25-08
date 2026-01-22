package operations;

import java.util.List;

public class Eighth {
	
	public static int sqr(int i)
	{
		return i*i;
	}

	public static void main(String[] args) {
	
		
		String s="are";
		List.of("abcde","aaa")
		.stream()
		.map(String::length)
		.map(Eighth::sqr)
		.forEach(System.out::println);
		
	}
}
