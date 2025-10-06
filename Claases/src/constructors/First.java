package constructors;

public class First {

	public static void main(String[] args) {
		
		Book book=new Book(100,'z','y'); //constructor call.
		
		//book.display();
	}
}



class Book
{
	double pri;
	public  Book(double price) {
		
		pri=price;
		System.out.println(price);
		System.out.println("good morning!......");
	}
	
	public Book()
	{
		System.out.println("Non Param....");
	}
	
	
	public Book(int i,char c, char d)
	{
		
		System.out.println(c+" ----"+d +i);
	}
	public void display()
	{
		
		System.out.println("the price of the book is:"+pri);
	}
	
}