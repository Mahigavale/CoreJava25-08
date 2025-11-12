package abstraction;

public class Fourth {

	public static void main(String[] args) {
		
		
		ABC abc=new ABC();
		
		abc.run();
	}

}

interface Idemo
{
	void run();
}

interface Idemo2
{
	void run();
}

class ABC implements Idemo2,Idemo
{

	
	public void run() {
		System.out.println("hello");
		
	}
	
}