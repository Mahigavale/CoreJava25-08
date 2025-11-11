package abstraction;

public class Second {

	public static void main(String[] args) {
		

		Ianimal ian=new tiger();
		Idrink idn=new tiger();
		
		
		
		tiger shera =new tiger();
		
		//shera.
	}

}

//Set of contract.
//100 %
//no constructor
//variables. => static and final.
interface Ianimal
{
	
	//static and final.
	 int id=123;
	
	 
	 void sleep(int i);
	 void sleep(int i,int j);
	 
	 void jump(String str);
	 
	 void  hunt(String str);
	 
	
}

interface Idrink
{
	int drink(String str);
}
class tiger implements Ianimal , Idrink
{

	@Override
	public void sleep(int i) {
		// TODO Auto-generated method stub
		
		 System.out.println(Ianimal.id);
		 
		 
	}

	@Override
	public void sleep(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hunt(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int drink(String str) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}