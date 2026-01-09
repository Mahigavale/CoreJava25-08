package functional_interfaces;

import java.util.function.Function;

public class Fucntion_1 {

	public static void main(String[] args) {
	
		
		Function<String, Integer> fun=(i)->{
			System.out.println("string to Integer....");
			return i.length();
		};
		
		Function<Character[], String> fun2=(i)->{ 
			System.out.println("first Array to String;;;");
			String s=new String();
			for(char c:i)
			{
				s=s+c;
			}
			return s;
};
		
		                  //after.compose(before)
		         Function<Character[], Integer> fun3=fun.compose(fun2);
		         System.out.println(fun3.apply(new Character[] {'a','b','d'}));
		                
	}
}
