package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			
			Class.forName ("com.mysql.cj.jdbc.Driver");
			
			Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshu","root","root")	;
		String str="insert into user(First_Name,Last_Name,City,Mobile_No) values('roshani','thorave','masur',89455212)";
		String str1="delete from user where id=3";
		String str2="update user set First_Name='rani' where id=1";
		String str3="Select *from user";
		String str4="Select * from user where City='masur'";
		
	Statement statement=	com.createStatement();
	//statement.execute(str1);
	statement.execute(str2);
	
	ResultSet rs=statement.executeQuery(str4);
	while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
		System.out.println(rs.getString(4));
		System.out.println(rs.getInt(5));
	}
	
	
	System.out.println("insert sucessFully");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
