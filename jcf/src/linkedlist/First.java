package linkedlist;

import java.util.LinkedList;

public class First {

	public static void main(String[] args) {
		
		/**
		 * Linked List => Sequential Access DS.
		 */
		LinkedList<Integer> list=new LinkedList<Integer>();

		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		
		System.out.println(list.get(3));
	}

}
