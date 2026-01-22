package operations;


import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		try (Scanner scan=new Scanner(System.in);
				Demo d=new Demo();
				){
			int s=scan.nextInt();
			System.out.println(s);
			
		}
		catch(Exception ex)
		{
		    ex.printStackTrace();
		}
		finally
		{
			
		}
	
	}

}

