package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLoperations {
	public static void main(String args[]) throws ClassNotFoundException{
		// register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Registered");
		
		 String url = "jdbc:mysql://localhost:3306/test";
		 String userName="root";
		 String password="root";
		 Connection connection=null;
		 Statement statement = null;
		 ResultSet rs=null;
		try {
			 connection = DriverManager.getConnection(url,userName,password);
			statement = connection.createStatement();
			/*
			String query = "Insert into nikhil values(NULL,'Pradeep',19);";
			int rowsAffected = statement.executeUpdate(query);
			System.out.println("Rows affected: " + rowsAffected);
			*/
			
			//selecting values from database
			String query = "Select * from nikhil";
			 rs = statement.executeQuery(query);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");	
                System.out.println(id+" "+ name+" " + age);
                
              }  
			

			
			/*//UPDATE 
			String query ="update nikhil set age=21 where id =5 ;";
			int temp=statement.executeUpdate(query);
			String query1="Select * from nikhil;";
			ResultSet rs =statement.executeQuery(query1);
			
			while(rs.next()) {
				int id=rs.getInt("id");
				int age=rs.getInt("age");
				String name = rs.getString("name");
				  System.out.println(id+ " "+name + " "+age);
				
			}
 			*/
			
			/*String query = "Insert into nikhil values(NULL,'ep',16);";
			int rowsAffected = statement.executeUpdate(query);
			System.out.println("Rows affected: " + rowsAffected);
			*/
			
		/*	// age >25
			String query ="Select * from nikhil;";
			ResultSet rs=statement.executeQuery(query);
			
			while(rs.next()) {
				int id=rs.getInt("id");
				int age=rs.getInt("age");
				String name = rs.getString("name");
				if(age >=25){
				  System.out.println(id+ " "+name + " "+age);
				}
			
		}*/
			
			
			
			
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		finally {
			try {
			
			statement.close();
			rs.close();
			connection.close();
			if (connection != null) {
			    if (connection.isClosed()) {
			        System.out.println("Connection is closed.");
			    } else {
			        System.out.println("Connection is still open.");
			    }
			}

		}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
		
		
		
		
		
		
		
		



			 

	

		
	}
	}
