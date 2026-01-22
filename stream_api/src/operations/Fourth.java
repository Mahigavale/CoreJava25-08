package operations;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class Fourth {
	
	public static void main(String[] args) {
		
		
		BiFunction<String, String[], Integer>
		bi=(t,u)->{  return t.length()+u.length;};
		
		System.out.println(bi.apply("abcd", new String[] {"abc","def"}));
		
		
		
		BinaryOperator<Integer> bio=(i,j)->{return i*j; };
		
		System.out.println(bio.apply(12, 34));
		
		
		
		
	String sum=List.of("10","10","10")
		.stream()
		.reduce("",(i,j)->{ return i.concat(j+"**");});
	
	System.out.println(sum);
		
		
	System.out.println("****************************************");
		
	Integer sum2=  IntStream.rangeClosed(1,10)
	  .reduce(0,(i,j)->{return i+j;});
	  
	
	System.out.println(sum2);
	
	System.out.println("##################################################");
	
	Integer i=Integer.valueOf(128);
	Integer i2=Integer.valueOf(128);
	
	System.out.println(i==i2);
		
	}

}

class Demo_add
{
	public static int add(int i, int j)
	{
		return i+j;
	}
}
