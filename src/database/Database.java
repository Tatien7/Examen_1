package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
        Class.forName("org.sqlite.JDBC");
        
       
		String url = "jdbc:sqlite:C:\\Users\\Usuario\\Desktop\\pro\\lite.txt";
	
		try(Connection con = DriverManager.getConnection(url)){
			var pt = con.prepareStatement("Select * from Persons");
			var resultSet = pt.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				
			}
		}
	}

}