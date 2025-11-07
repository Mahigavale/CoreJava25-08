package polymorphism;

public class Aero {

	
		private static  String name2="angad";
		private String name="abc";
		
		 protected String protect="Protcted access modifier";
		  String  city="Pune";
		  
		  void showcity()
		{
			System.out.println("Default Access:"+this.city);
		}
		
		public void showname()
		{
			System.out.println(name);
			System.out.println(name2);
			
			
		}
		
		protected void showpro()
		{
			System.out.println(this.protect);
		}
	}
