package queueif;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list_2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		//ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=1;i<100000001;i++)
		{
			list.add(i);
			//list2.add(i);
		}

		
		long StartTime=System.nanoTime();
		//443140,935867
		//13,11,12
		//list2.remove(99999999);
		list.remove(50000001);
		long  endTime=System.nanoTime();
		System.out.println((endTime-StartTime)/1000);
	}
}
