package custom_compile_time;

public class Third {

	public static void main(String[] args) {
		int i=89;
		
		try
		{
			
		
		if(i>85)
		{
			throw new Custom_unhanled_exception("Value is larger..");
		}
		}
       catch(Custom_unhanled_exception ex)
		{
    	   System.out.println(ex.getMessage());
		}

	}

}


//unhandled=> Try and Catch block not needed.
class Custom_unhanled_exception extends RuntimeException
{
	public Custom_unhanled_exception(String str)
	{
		super(str);
	}
}