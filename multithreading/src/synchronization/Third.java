package synchronization;

public class Third {

	
	public static void main(String[] args) throws InterruptedException {
	
		Resource rs=new Resource();
		First_T first=new First_T();
		Second_T second=new Second_T();
		first.rs=rs;
		second.rs=rs;
		
		first.start();
		second.start();
		
	}

}


class Resource 
{
	   boolean flag=true;
	    
}
class First_T extends Thread
{
	
	Resource rs;
	
	
	public void run()
	{
		
		while(rs.flag)
		{  int i=1000;
			while(i>=0)
			{
				System.out.println("TRUE");
				i--;
			}
		}
	}
	}



class Second_T extends Thread
{
	Resource rs;
	
	
	public void run()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("SETTING FALSE");
		rs.flag=false;
	}
}