package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie {
	 Connection con=Mycon.getConnection();
    public void displayMovieDetails() {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from movie");  
	    	while(rs.next()){  
	    	System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+ rs.getString(5));  
	    	}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
    }
    public void updateYear(Integer year,Integer id) {
    	try {
			PreparedStatement stmt=con.prepareStatement("update movie set released_year =? where id=?");
			stmt.setInt(1, year);
			stmt.setInt(2, id);
			System.out.println(stmt.executeUpdate()+" records updated of movie " +id );
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public void deleteById(Integer id) {
    	try {
			PreparedStatement stmt=con.prepareStatement("delete from  movie  where id=?");
			stmt.setInt(1, id);
			System.out.println(stmt.executeUpdate()+" records deleted of movie " +id );
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public void insertImg() {
    	PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into imgtable  (name,photo) values(?,?)");
			ps.setString(1,"landscape");  
	    	FileInputStream fin=new FileInputStream("d:\\OIP.jpg");  
	    	ps.setBinaryStream(2,fin,fin.available());  
	    	int i=ps.executeUpdate();  
	    	System.out.println(i+" records affected"); 
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}  
    	 
    }
    
    public void displayImg() {
		try {
			PreparedStatement ps=con.prepareStatement("select * from imgtable where id= ?");  
	    	ps.setInt(1,4);
			ResultSet rs=ps.executeQuery();  
	    	if(rs.next()){//now on 1st row  
	    		byte b[]=rs.getBytes(3);//2 means 2nd column data  
		    	//byte barr[]=b.;//1 means first image  
		    	FileOutputStream fout;
				fout = new FileOutputStream("d:\\m1.jpg");
				fout.write(b);  
		    	fout.close(); 
		} 
		}catch (IOException | SQLException e) {
			e.printStackTrace();
		}  
    	 
    	}

    
    public void insertMovie(String name,String actor,String actress,Integer released_year) {
    	try {
    		PreparedStatement stmt=con.prepareStatement("insert into movie (movie_name,actor,actress,released_year) values(?,?,?,?)"); 
			stmt.setString(1,name);
			stmt.setString(2,actor);
	    	stmt.setString(3,actress);
	    	stmt.setInt(4,released_year);
	    	System.out.println(stmt.executeUpdate()+" records inserted"); 
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    public void insertFile() {
    	PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into filetable (name) values(?)");
			File f=new File("d:\\sumo.txt");  
			FileReader fr=new FileReader(f);  
			ps.setCharacterStream(1,fr,(int)f.length());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");   
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}  
    	 
    }
	
}
	
	

