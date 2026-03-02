package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Second {

	public static void main(String[] args) throws SQLException {
		
		
		
		 try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
				 PreparedStatement stmt=con.prepareStatement("delete from student where id=2;");)
               
				 {
					 
					  boolean rs=stmt.execute();
					  
					  System.out.println(stmt.getUpdateCount());
					  System.out.println(rs);
//		 {
//			                   while(rs.next())
//			                   {
//			                	   System.out.println("Id"+rs.getInt("id"));
//			                	   System.out.println("name"+rs.getString("name"));
//			                	   System.out.println("email"+rs.getString("email"));
//			                	   System.out.println("****************");
//			                   }
//			            
//		 }
				 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		
		
	}
}
