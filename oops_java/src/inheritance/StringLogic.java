package inheritance;


public class StringLogic {

	public static void main(String args[])
	{
		
		Demo demo=new Demo();
		
		System.out.println(demo.name);
		demo.add(12, 12);
	}
}

class StringHelper
{
	public final String name="Macdonalds";
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
}

/**
 * Inheritance
 * Types , keywords.
 */
class Demo extends StringHelper
{
	/**
	 * IS-A relation.
	 */
}