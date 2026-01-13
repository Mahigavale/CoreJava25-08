package stream_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Third {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("hello");
		list.add("bolo");
		list.add("appolo");
		
		System.out.println(list);
		
	
		
		Function<String, String> fun2=(t)->{return t.toUpperCase();};
		Function<String,String> fun=(t)->{return new StringBuffer(t).reverse().toString();};
		Consumer<String> con=(i)->{System.out.println(i);};
	
		list.stream().map(fun2)
		.map(fun).forEach(con);
	}

}
