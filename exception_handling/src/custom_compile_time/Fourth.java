package custom_compile_time;

public class Fourth {

	public static void main(String[] args) {
		

		
		int age=67;
		
		
		try
		{
			if(age >40 &&age<50)
			{
				throw new NumberException();
			}
			else  if(age >50 && age<70 )
			{
				throw new Number2Exception();
			}
			else if(age >100 && age<120)
			{
				throw new RuntimeException("Hello");
			}
			
			else
			{
				System.out.println("You are young...");
			}
		}
		
//		catch(RuntimeException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
		catch(RuntimeException |NumberException | Number2Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
		
//		Exception ex=new NumberException();//new NumberException()
//		Exception ex2=new Number2Exception();//new Number2Exception();
	}
	

}


class NumberException extends Exception
{
	
	public NumberException()
	{
		super("This is the number Exception");
	}
}

class Number2Exception extends Exception
{
	public Number2Exception()
	{
		super("this is Number 2 -2 2- Exception!");
	}
}