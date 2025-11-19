package info;

public class Third {

	public static void main(String[] args) {

		
		String str="sonday";
		String str2=str.toLowerCase();
		
		//NotASundayException ex= new NotASundayException("Sunday nhi re baba!");
		try
		{
			if(  str2.equals("sunday")==false)
			{
				 throw new NotASundayException();
			}
			System.out.println("Let's play Cricket>>>>!");
		}
		catch(NotASundayException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			
			System.out.println("THE END");
		}
	}
}


class NotASundayException extends Exception
{
	public NotASundayException()
	{
		super("Not a Sunday Exception... Today is not sunday.");
	}
	
}