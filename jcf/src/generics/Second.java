package generics;

import java.util.HashMap;

public class Second {

	public static void main(String[] args) {

		converter<String,Integer> con=new converterimpl();
		
		System.out.println(con.convert("asjidekdmekmldmel"));
		
	
	}

}

interface converter<T,R>
{
	 R convert(T t1);
}

class converterimpl implements converter<String, Integer>
{

	
	public Integer convert(String t1) {
		return t1.length();
	}
	
}