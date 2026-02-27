package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class First {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
	
		
		
		// Reflection Of the Driver Class.
	//	Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Properties prop=new Properties();
		
		prop.put("user", "root");
		prop.put("password", "root");
		
		 
	try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root","root");
			 Scanner scan=new Scanner(System.in);)
		//	Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root","root"))
	{
		
		/**
		 * This is the Static Query =>The Data is Fixed.
		 *  Not Advised at All. 
		 */
		
//		          // Sql Query.
//		          Statement stmt =con.createStatement();
//		          //executeUpdate(SQL) => no. of rows affected.
//		           int rows=stmt.executeUpdate("insert into employee values(89,'dhj',123.88),(90,'XYZABC',123.88),(91,'XYZABC',123.88);");
//		           System.out.println("rows affected:"+rows);
//		           System.out.println("Connection Opened....!");
		           
		           
		   /**        
		    * Let's write the dynamic Queries.
		    * PrepareStatement 
		    */
		
		
		
		      PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?);");
		                                                                             //1,2,3
		     
		      
		      for(int i=0;i<5;i++)
		      {
		  		
		  		System.out.println("Please enter the ID");
		  	    	int id=scan.nextInt();
		  		//Thread.sleep(1000);
		  		System.out.println("Please enter the name");
		  		//Thread.sleep(1000);
		  		String name=scan.next();
		  		//scan.next();
		  		System.out.println("Please enter the salary");
		  		double sal=scan.nextDouble();
		  		   stmt.setInt(1, id);
			       stmt.setString(2, name);
			       stmt.setDouble(3, sal);
			       
			        System.out.println("rows:"+stmt.executeUpdate());
		      }
		      
		       
		  //   System.out.println("no. of rows affected:"+stmt.executeUpdate());
		              
	}
		
	
		
		
        	
		
	}

}
