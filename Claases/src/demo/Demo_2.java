package demo;

public class Demo_2 {

	public static void main(String[] args) {
		
		Railway rail=new Railway();
		
		rail.add(10,20);
		
		rail.sub(13.0, 2, 10.0);
		Railway rail2=new Railway();
		
		rail2.add(100,200);
		rail2.sub(100, 50, 40);
	}
}

class Railway
{
	
	//method parameters
	public void  add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	//d,i,d
	public void sub(double d1, int d2, double d3)
	{
		
		System.out.println(d1-d2-d3);
	}
}