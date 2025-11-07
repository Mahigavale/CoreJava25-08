package inheritance;

import polymorphism.Aero;
public class Defaultdemo  {

	public static void main(String[] args) {
		
   
		// Def d=new Def();
		 
		
	Prot pr=new Prot();
	Aero aero=new Aero();
	
	 System.out.println(aero.protect);
	
	
	 System.out.println(pr.protect);
	
	pr.showpro();
		
		
		
		 
	}

}

class Def  
{
	 //No not inheritance and not object.
	Aero aero=new Aero();
	
	public void demo()
	{
   
	}
	
	
}

class Prot extends Aero
{
	
}

