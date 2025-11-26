package contract;

public class Third {

	public static void main(String[] args) {
		

		Book first=new Book(1,"ABC",67.89);
		
		Book second=new Book(1,"ABC",67.89);
		
		Book third=new Book(1, "ABC",67.89);
		

		/**
		 * Reflex....
		 */
		
		System.out.println(first.equals(first));
       System.out.println(second.equals(second));
		/**
		 * Symmetry
		 */
		 System.out.println(first.equals(second));
		 System.out.println(second.equals(first));
		 /**
		  * 
		  * Transitivity.
		  */
		 System.out.println("*******************************");
		 System.out.println(first.equals(second));
		 System.out.println(second.equals(third));
		 System.out.println(first.equals(third));
		 /**
		  * Consistency.
		  */
		
		  System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		 System.out.println(first.equals(second));
	}

}


class Book
{
	int id;
	String name;
	double price;
	
	
	public Book(int id,String name,double price)
	{
		this.name=name;
		this.id=id;
		this.price=price;
	}
	
	public boolean equals(Object obj)
	{
		 Book another=(Book)obj;
		 
		 return this.id==another.id && this.name.equals(another.name)&&this.price==another.price;
	}
}