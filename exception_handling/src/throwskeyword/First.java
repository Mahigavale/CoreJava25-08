package throwskeyword;

public class First {

	public static void main(String[] args){
		
		Registration reg=new Registration();
		
		
		System.out.println("10");
	
		try {
		reg.entermobile("12345678");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
     System.out.println("14");
	}
}

class Registration {

	public void entermobile(String str) throws  NotNullMobileException,InvalidMobileException
	{

		if (str == null) {
			throw new NotNullMobileException();
		} else if (str.length() == 10) {
			System.out.println("Successfully registered : welcome:" + str);
		} else {
			throw new InvalidMobileException();
		}
	}

}

class USSREgistarion extends Registration
{
	public void entermobile(String str) throws NotNullMobileException,InvalidMobileException
	{
		super.entermobile(str);
	}

}
	
	class InvalidMobileException extends Exception
	{
		public InvalidMobileException()
		{
			super("Please enter the valid Mobile Number.");
		}
	}
	
	class NotNullMobileException extends Exception
	{
		public NotNullMobileException()
		{
			super("Mobile cannot be null.....");
		}
	}
