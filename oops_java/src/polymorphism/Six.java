package polymorphism;

public class Six {

	public static void main(String[] args) {
		

		/**
		 * Private,  ****
		 * Default ,  ***
		 * protected , **
		 * public       *
		 */
		
		
//		Aero aero=new Aero();
//		
//		aero.showname();
		
//		
//		Gero gero=new Gero();
//		
//		System.out.println(gero.city);
//		gero.showcity();
		
		
		
		
		Gero gero =new Gero();
		
		gero.showpro();
		System.out.println(gero.protect);

}
}
//class  Aero
//{
//	private static  String name2="angad";
//	private String name="abc";
//	
//	 
//	  String  city="Pune";
//	  
//	  void showcity()
//	{
//		System.out.println("Default Access:"+this.city);
//	}
//	
//	public void showname()
//	{
//		System.out.println(name);
//		System.out.println(name2);
//		
//		
//	}
//}

class  Gero  extends Aero
{
//	 Aero aero=new Aero();
//	 
//	 public void showre()
//	 {
//		 System.out.println(aero.protect);
//		 aero.showpro();
//	 }

}