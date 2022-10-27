package AirlineReservationSystem;

import java.sql.*;
import java.util.Scanner;

public class cancel extends login{
	
 public static void cancel1() throws SQLException {
	 
	 System.out.println("Enter your email : ");
	 
	Scanner sc = new Scanner(System.in);
	
	String username1 = sc.next();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Prashant@3721");
	
		Statement st=con.createStatement();

		String query1 = "delete from booking where email='"+username1+"'";
       
		st.executeUpdate(query1);
	}
	
	catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
	System.out.println("You have cancel your flight....!");
	} 
 }

