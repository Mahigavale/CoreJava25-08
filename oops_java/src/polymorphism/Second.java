package polymorphism;

public class Second {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		
		
		animal.run();
		animal.run(67);
		
		Animal.disp();
		
				}

}
class Animal
{
	public void run()
	{
		System.out.println("RUnning");
	}
	
   public void run(int i)
   {
	   System.out.println(i+": Running");
   }
   
   
   public static void disp()
   {
	   System.out.println("This is the display method...");
   }
   
   public static void disp(int i)
   {
	   System.out.println("paramterized static method..");
   }
   
   final public void run3()
   {
	   
   }
   
   final public void run3(int i)
   {
	   
   }
}
