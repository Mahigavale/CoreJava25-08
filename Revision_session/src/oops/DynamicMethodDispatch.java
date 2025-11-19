package oops;

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		
		
		Aeroplane aero=new Boeing();
		
		
		aero.takeof();
	}

}

class Aeroplane
{
	//void,primitive => 
	public Masakali takeof()
	{
		return new Masakali();
	}
}

class Boeing extends Aeroplane
{
	public Peigon takeof()
	{
		return new Peigon();
	}
}


class Peigon
{
	
}

//Masakali is-a Peigon.
class Masakali extends Peigon
{
	
}