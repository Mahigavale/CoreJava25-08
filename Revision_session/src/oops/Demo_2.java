package oops;

public class Demo_2 {

	public static void main(String[] args) {
	
		
		
		Exception ex=new Exception("Invalid age");
		
		System.out.println(ex.getMessage());
		
	}
}



class Throwable
{
	String message;
	
	
	public Throwable(String str)
	{
		this.message=str;
	}
	public String getMessage()
	{
		return this.message;
	}
}

//Exception IS-A Throwable.

class Exception extends Throwable
{
	public Exception(String str)
	{
		super(str);
	}
}