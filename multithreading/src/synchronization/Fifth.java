package synchronization;

public class Fifth {

	
	   static boolean flag=true;
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread t1=new Thread(()->{
			System.out.println("Thread started..");
			while(flag)
			{
				System.out.println("hello");
			}
			System.out.println("ended........");
		});
		
		
		t1.start();
		
		
		System.out.println(flag);
		Thread.sleep(5000);
		
		flag=false;
		System.out.println(flag);
	}
}
