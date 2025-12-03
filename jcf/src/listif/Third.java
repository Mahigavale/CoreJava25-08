package listif;

import java.util.ArrayList;
import java.util.List;

public class Third {

	public static void main(String[] args) {


// 11,13,15,17=>12,14,16
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(17);
		list.add(20);


		int num=list.getFirst();
   for(int i=list.getFirst() ;i<=list.getLast();i++)
   {
	   if( list.contains(num)==false)
	    {
	    	System.out.println(num);
	    }
	    num++;
	   
   }
		
		
	}

}
