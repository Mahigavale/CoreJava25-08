package throwskeyword;

public class Third {

	public static void main(String[] args) {
		
		 try {
		demo.demo_1(67);
		 }
		 catch(HealthException |Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		 
	}
}



class HealthNotOkException extends Exception
{

	public HealthNotOkException(String str)
	{
		super(str);
	}
}

class HealthException extends Throwable 
{
	public HealthException(String str)
	{
		super(str);
	}
}

class demo
{
	public static void demo_1(int number) throws HealthNotOkException,HealthException
	{
		if(number>50 && number<60)
		{
			throw new HealthNotOkException("number in the range of 50-60");
		}
		else if (number >60 && number <70)
		{
			throw new HealthException("number in the range of the 70");
		}
	}
}