package throwskeyword;

public class Fourth {

	public static void main(String[] args) {
	
		
		int age=678;
		
		
		try {
			if(age >60)
			{
				throw new UserNotFound(505);
			}
		}
		catch(UserNotFound us)
		{
			System.out.println(us.getStatuscode());
		}
	}
}

class UserNotFound extends Exception
{
	int statuscode;
	
	public UserNotFound(int statuscode)
	{
		
		super("USER IS NOT REGISTERED....!!!!");
		this.statuscode=statuscode;
	}
	
	public int getStatuscode()
	{
		return  this.statuscode;
	}
}
