package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MissingNumbers {

	public static void main(String[] args) {

       List<Integer> list=Arrays.asList(2,5,7,8,9,11,12);
       //2=>8
       
       IntStream.rangeClosed(2, 12)
       .forEach((i)->{
    	   if(!list.contains(i))
    	   {
    		   System.out.println(i);
    	   }
       });

	}

}
