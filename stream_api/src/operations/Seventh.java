package operations;

import java.util.List;

public class Seventh {
	public static void main(String[] args) {

		
		StringBuffer s=new StringBuffer("hello");
		
		List.of("abcd","xyza","ijkl")
		.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}
}
