package demo;

public class Demo {

	public static void main (String[] args) {
		
		int age=23; //Primitive
		// age is int having value 23.

		//Stack , Heap
		
		 School Little_star=new School();
		 
		 Little_star.name="Little_angel";
		 Little_star.pincode="121212";
		 
		 Little_star.add();
		 
		 School poddar=new School();
		 
		 poddar.name="PDS";
		 poddar.pincode="343434";
		 
		 poddar.add();
		 poddar.add();
		 poddar.add();
	}

}

class School
{
	/**
	 * Data Members.
	 */
	/**
	 * Non Primitive / Custom Data.
	 */
	String name;
	String pincode;
	
	
	
	//Member Function
	public void add()
	{
		
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
		System.out.println("This is the add method of School Class.");
	}
}

