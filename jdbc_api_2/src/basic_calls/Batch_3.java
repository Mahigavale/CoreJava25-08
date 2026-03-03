package basic_calls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_3 {

	public static void main(String[] args) throws SQLException, InterruptedException {
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch", "root", "root");
		 Statement stmt=con.createStatement();
		 con.setAutoCommit(false);
		
		 stmt.addBatch("insert into student values(1,'1a','1ag');");
		 stmt.addBatch("insert into student values(2,'2a','2ag');");
		 stmt.addBatch("insert into student values(3,'3a','1ag');");
		 stmt.addBatch("insert into student values(4,'4a','4ag');");
		  try {
			  
		   stmt.executeBatch();
		   con.commit();
		  }
		  catch(Exception ex)
		  {
			   System.out.println("line Number:"+ex.getStackTrace()[3]);
			   System.out.println("pala re pala....");
			   Thread.sleep(1000);
			   System.out.println("Intiating roll back..");
			   con.rollback();
		  }
		  
	}

}
