package constructors;

public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Run run=new Run();
		
	}

}

class Run
{
	static
	{
		
		try {
		throw new RuntimeException("hello");
		
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println("static");
	}
	
	public Run()
	{
		System.out.println("constructor");
		throw new RuntimeException("hellp");
	}
}