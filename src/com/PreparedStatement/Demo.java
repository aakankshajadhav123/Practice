package com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) throws SQLException {
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/akshu","root","root");
	
	PreparedStatement pr=con.prepareStatement(" Delete from crome where id=3 ");
	 /*pr.setString(1, "akanksha");
	 pr.setString(2, "jadhav");
	 pr.setString(3, "karad");
	 pr.setString(4, "1256632");*/
	 
	 pr.execute();
	 System.out.println("sucessfully insert");
	 
	con.close();
	pr.close();
			
	
	/*
	PreparedStatement pr=con.prepareStatement("Select * from crome where City='satara'");
ResultSet rs=	pr.executeQuery();
while(rs.next()) {
	System.out.println(rs.getInt(1)+ " " + rs.getString(2)+" "+ rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
}*/
	
	
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
