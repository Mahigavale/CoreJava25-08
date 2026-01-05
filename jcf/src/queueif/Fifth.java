package queueif;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fifth {

	public static void main(String[] args) {

     List<?> list=new LinkedList<Integer>();
     
     
     List<?> list2=new ArrayList<String>();
     
     System.out.println(list.getClass()==list2.getClass());
   //  System.out.println(list2.getClass());
     
     System.out.println(list.getClass());
     System.out.println(list2.getClass());
	}

}
