import java.sql.Connection;
import java.sql.Statement;
import dbutil.DBConnection;
import java.sql.*;

public class valueInsert {

	public static void main(String[] args) {
		
		
		 try { 
			 Connection connection = DBConnection.getConnection();
	            
	            Statement st = connection.createStatement(); 
	            st.executeUpdate("INSERT INTO T_Employee_sss " + 
	                "VALUES (1007, 'Sworna', 5000, 'Bangladesh', '123bd')"); 
	            st.executeUpdate("INSERT INTO T_Employee_sss " + 
	                "VALUES (1005, 'Roshan', 6000, 'Nepal', '123np')"); 
	            st.executeUpdate("INSERT INTO T_Employee_sss " + 
	                "VALUES (1006, 'Mukesh', 8000, 'Vutan', '123vt')"); 
	           

	            connection.close(); 
	        } catch (Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	        } 
		

	}

}
