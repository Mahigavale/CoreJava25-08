package iterating;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Itr_Map {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		
		
		map.put(23, "hello");
		map.put(234, new String("hellos"));
		map.put(11, null);
		map.put(189, "null");
		System.out.println(map);
		
		
	
		
		
		for( Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getValue());
		}
		
		Iterator<java.util.Map.Entry<Integer, String>> itr=map.entrySet().iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
