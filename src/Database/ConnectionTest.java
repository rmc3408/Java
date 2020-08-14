package Database;

import java.sql.*;
import javafx.application.Application;
import javafx.stage.Stage;

public class ConnectionTest extends Application
{
	
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   static final String DB_URL = "jdbc:oracle:thin:@199.212.26.208:1521/SQLD";

	   
	   //  Database credentials
	   static final String USER = "COMP214_M20_zor_63";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   
	   try
	   {
	      //STEP 2: Register JDBC driver
	      Class.forName("oracle.jdbc.driver.OracleDriver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT category FROM A4_berryfruit";
	      ResultSet rs = stmt.executeQuery(sql);
	      
	      
	      //STEP 5: Extract data from result set
	      while(rs.next())
	      {
	         //Retrieve by column name
	         String cat = rs.getString("category");
	         
	         //Display values
	         System.out.println("Category of Berry: " + cat);
	         
	      }
	      
	      rs.close();
	      stmt.close();
	      conn.close();
	      
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
	