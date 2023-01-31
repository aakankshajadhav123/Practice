package com.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInput {
	
	public void insertStudentInfo(String name,String lastName, String city,int mbno) {
		
		ConnectionPooling connection =new ConnectionPooling();
		try {
	Connection con=		connection.getConnection();
		PreparedStatement ps=	con.prepareStatement("insert into student (First_Name,Last_Name,City,Mobile_No)values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, lastName);
			ps.setString(3, city);
			ps.setInt(4, mbno);
		
			ps.execute();
			con.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many students data you want to insert");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			System.out.println("enter first name");
			String name=sc.next();
			System.out.println("enter last name");
			String lastName=sc.next();
			System.out.println("enter city");
			String city=sc.next();
			System.out.println("enter mobile no");
			int mbno=sc.nextInt();
			
			UserInput us=new UserInput();
			us.insertStudentInfo(name, lastName, city, mbno);
			
			
		}
	}

}
