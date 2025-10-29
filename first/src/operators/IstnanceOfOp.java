package operators;

public class IstnanceOfOp {

	public static void main(String[] args) {
		

		Animal animal =new Animal();
		
		/**
		 * Java version,use case.scrape the web.
		 * instance is of specific class.s
		 */
	boolean result=animal instanceof  Animal;
	System.out.println(result);
	
	//System.out.println();
	
	String str="abc";
	
	boolean res=str instanceof String;
	
	System.out.println(res);
		
	}

}

class Animal
{
	final static int classid =12;
	
	final static String name="Tara";
	
	public Animal()
	{
		System.out.println("object created....");
	}
}
