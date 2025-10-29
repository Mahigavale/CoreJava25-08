package encapsulation;

public class Password {

	public static void main(String[] args) {
		
		Instagram aniket=new Instagram();
		
		
		
		aniket.setPassword("abc");
		System.out.println(aniket.getpassword());
	}

}

class Instagram
{
 private String password;
private 	String username;


public void setPassword(String password)
{
	if(password.contains("@q"))
	{
	this.password=password;
	}
	else
	{
		System.out.println("weak password...");
	}
}

public String getpassword()
{
	return this.password;
}
}