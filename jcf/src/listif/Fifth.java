package listif;

import java.util.ArrayList;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {
	

	List<Integer> list=new ArrayList<Integer>();
	
	list.add(11);
	list.add(13);
	list.add(16);
	list.add(17);
	list.add(20);
 
/**	
 *  Integer i :=> List 
 */
	
	List<Integer> list2=new ArrayList<Integer>();
	
	for(int i :list)
	{
		if(i%2==0)
		{
			list2.add(i);
		}
	}
	
	System.out.println(list2);
	System.out.println(list);
	
	list.removeAll(list2);
	
	System.out.println(list);
}
}

