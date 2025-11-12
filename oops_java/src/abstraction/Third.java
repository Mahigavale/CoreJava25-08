package abstraction;

public class Third {

	public static void main(String[] args) {
		
		Study stud=new Study() {

			@Override
			public void dostudy(String str) {
				System.out.println("stjrfnkrfnkkd");
				
			}
		
		public void visit()
		{
			System.out.println("I am visiting the person.");
		}
		
		};
	
		stud.dostudy("SRK");
		stud.visit();
		
		
		Study stud2=new Javastudent()
;
		
		
		
		
	
	}
}

 abstract class Study
{
	 int i=23;
	 
	 public abstract void dostudy(String str);
	 
	 public void dorest()
	 {
		 System.out.println("rest for some time");
	 }
	 
	 abstract public void visit();
	 
	 public static  void hush()
	 {
		 System.out.println("static hush...");
	 }
}
 
 class Javastudent extends Study
 {

	@Override
	public void dostudy(String str) {
		
		System.out.println("I am studying:"+str);
		
	}
	
	public void nostudy()
	{
		System.out.println();
	}

	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}
	 
 }