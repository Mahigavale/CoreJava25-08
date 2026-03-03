package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batch_2 {

	public static void main(String[] args) throws SQLException {
	
		
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch", "root", "root");
				 PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?);");
                 Scanner scan=new Scanner(System.in);
		
			
			//con.setAutoCommit(false);
              
			for(int i=0;i<2;i++)
			{
				int id=0;
				String name=null;
				String email=null;
				
				System.out.println("enter the id");
				id=scan.nextInt();
				System.out.println("enter the name:");
				name=scan.next();
				System.out.println("enter the email:");
				email=scan.next();
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setString(3, email);
				stmt.addBatch();
				
			}
		     int[] arr=stmt.executeBatch();
		  //   con.commit();
		     for(int i:arr)
		     {
		    	 System.out.println(i);
		     }
		     System.out.println(":Commiting the changes....");
		    
               
                

		     con.close();
		     scan.close();
		}
		

              
	}



class Student
{
	int id;
	String name;
	String email;
}