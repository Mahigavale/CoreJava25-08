package abstraction;

public class Java8feature {

	public static void main(String[] args) {
		
		
		UPI upi=new Phonepe();
		upi.dopaymanet("123@!ybl");
		 System.out.println(upi.sendmessage("hello"));
		
		 System.out.println(upi.recievemessage());
		 
		 
		 UPI.sendre();
		 
	}
}

interface  UPI
{
	// 100000
	 long dopaymanet(String str);
	
	 String sendmessage(String str);
	 
	default String recievemessage()
	 {
		 return "defualt behaviour";
	 }
	 
	 static int sendre()
	 {
		 System.out.println("hello from UPI");
		 return 12;
	 }
}


class Phonepe implements UPI
{

	@Override
	public long dopaymanet(String str) {
		System.out.println("Doing the payment..");
		
		return 1234543l;
	}

	@Override
	public String sendmessage(String str) {
		return "Received message is :"+str;
	}
	
	public String recievemessage()
	{
		return "Phonepe behaviour";
	}
	
	public int sendre()
	{
		System.out.println("hello");
		return 123;
	}
}