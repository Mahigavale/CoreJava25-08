package polymorphism;

public class Seventh {

	public static void main(String[] args) {
		
		
		

		Eighth eight=new Eighth();
		
		System.out.println(eight.city);
		eight.showcity();
	}

}
class Eighth extends Aero
{
	
}


class Ninth 
{
	Aero aero=new Aero();
	
	public void showre()
	{
		System.out.println(aero.city);
		aero.showcity();
	}
}
