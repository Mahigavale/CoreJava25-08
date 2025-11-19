package info;


public class Second {

	public static void main(String[] args) {
		
		int age=19;
	
		
		try
		{
			
			if(age<20)
			{
				/**
				 * This line will terminate the whole try block.
				 */
				throw new InvalidAgeException("you are not eligible.");
			}
			
			System.out.println("you are eligible...");
		}
		catch(InvalidAgeException ex)
		{
			 System.out.println(ex.getMessage());
		}
		finally
		{
			 System.out.println("!...THE END...!");
		}
	
		
	}

}



class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		 super(str);
	}
}
