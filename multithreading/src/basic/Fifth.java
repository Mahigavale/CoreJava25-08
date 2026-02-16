package basic;

public class Fifth {

	  static boolean flag=true;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread read=new Thread(()->{
			
			System.out.println("reading started...");
			while(flag==true)
			{
				
			}
			System.out.println("reading operation ended....");
		});
		
		Thread write=new Thread(()->{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("setting the flag to false......");
			flag=false;
		});
		
		read.start();
		write.start();
		Thread.sleep(2000);
		System.out.println("Main setting the flag to true....");
		flag=true;
		
	}
}
