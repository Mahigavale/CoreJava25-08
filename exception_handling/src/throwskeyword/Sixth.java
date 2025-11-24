package throwskeyword;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sixth {

	public static void main(String[] args) {


		List<Book> book=new ArrayList<Book>();
		
		
		try {
		for(long i=1; i<50000000;i++ )
		{
			Book bookobj=new Book((int)i, "A"+i, 67.89,9.8,67,"DELHI","ABC");
			
			 book.add(bookobj);
		}
		}
		catch(OutOfMemoryError er)
		{
			System.out.println(er.getMessage());
		}
		finally
		{
			System.out.println("THE END");
		}
		
	}
}


class Book
{
	
	int id;
	String name;
	double price;
	double ratings;
	int pages;
    String publicationhouse;
    String genere;
    
    
	public Book(int id, String name, double price, double ratings, int pages,
			String publicationhouse, String genere) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.ratings = ratings;
		this.pages = pages;
		this.publicationhouse = publicationhouse;
		this.genere = genere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getPublicationhouse() {
		return publicationhouse;
	}
	public void setPublicationhouse(String publicationhouse) {
		this.publicationhouse = publicationhouse;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
}