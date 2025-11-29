package generics;



public class First {

	public static void main(String[] args) {

		Objectadder<String> iad = new Objectadder<String>();

		iad.add("12", "13");

		System.out.println(iad.getinstance("abcdered"));

	}
}

/**
 * Public , abstract
 */
interface Iadd<T> {
	// You have only decided the behaviour here.
	void add(T t1, T t2);
}
//
//class Integeradder implements Iadd<Integer> {
//
//	public void add(Integer t1, Integer t2) {
//
//		System.out.println(t1+t2+500);
//	}
//
//}
//
//class  Stringadder implements Iadd<String>
//{
//
//	@Override
//	public void add(String t1, String t2) {
//		System.out.println(t1.toLowerCase()+t2.toLowerCase());
//		
//	}
//	
//}

class Objectadder<T> implements Iadd<T> {

	public void add(T t1, T t2) {

		if (t1 instanceof Integer && t2 instanceof Integer) {
                  int i=(int)t1;
                  int j=(int)t2;
                  System.out.println(i+j);
		}
		else if(t1 instanceof String && t2 instanceof String) {
              String s1=(String)t1;
              String s2=(String)t2;
              System.out.println("String found:"+s1+s2);
	}

	}

	public int getinstance(T t) {
		if (t instanceof String) {
			return ((String) t).length();
		}
		return 0;
	}

}