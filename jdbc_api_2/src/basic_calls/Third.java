package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Third {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub


		 try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
				 PreparedStatement stmt=con.prepareStatement("delete from student where id=3;");)
		 {
			  
		 boolean flag=stmt.execute();
		 if(flag)
		 {
			 System.out.println("DQL");
			 ResultSet rs=stmt.getResultSet();
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1));
				 System.out.println(rs.getString(2));
				 System.out.println(rs.getString(3));
				 System.out.println("*****************");
			 }
			 
		 }
		 else	 
		 {
			 System.out.println("DML");
			 int i =stmt.getUpdateCount();
			 System.out.println("NO of rows affected :"+i);
		 }
		 }
           
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
	}

}
