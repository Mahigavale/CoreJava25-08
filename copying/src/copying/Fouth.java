package copying;

public class Fouth {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		// TODO Auto-generated method stub

		
	//	Thread.sleep(3000);
		
		Author author=new Author();
		author.author_name="V.P. Kale";
		
		Book book =new Book();
		book.name="Amrutvel";
		book.price=250;
		book.author=author;
		Book book2=(Book)book.clone();
		
		book2.name="Partner";
		book2.author.author_name="V.S. Khandekar";
		
		System.out.println("Book:"+book.name+":::"+book.price+"Book author:"+book.author.author_name);
		
		System.out.println("Book:"+book2.name+":::"+book2.price+"Book author :"+book2.author.author_name);
	}

}

class Book implements Cloneable
{
	String name;
	double price;
	Author author;
	
	public Object clone() throws CloneNotSupportedException
	{
		Book b1=(Book)super.clone();
		b1.author= (Author)this.author.clone();
		return b1;
	}
}


class Author implements Cloneable
{
	String author_name;
	
	public Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();
	}
}