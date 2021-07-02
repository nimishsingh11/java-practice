package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mycon {
		private static Connection con=null;
		private Mycon(){
		}
		/**
	     * Get the db connection
	     * @return a <code>java.sql.Connection</code> object
	     * @warning don't forget to close the connection
	     */
	synchronized public static Connection getConnection(){
		if(con==null) {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/student";
		    con = DriverManager.getConnection(url,"postgres", "root");
		    System.out.println("Connected With the database successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Error while connecting to the database");
		}
		}
		return con;
	}
}
		
		
