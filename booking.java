package AirlineReservationSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class booking {
	public static void booking1() throws Exception{
	Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name : ");
			String name = sc.next();
			
			System.out.print("Enter your surname : ");
			String surname = sc.next();
			
			System.out.print("Enter bfrom : ");
			String bfrom = sc.next();
			
			System.out.print("Enter bto : ");
			String bto = sc.next();
			
			System.out.print("Enter Email : ");
			String email = sc.next();
			 
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Prashant@3721");
				
				String query=("update booking set bfrom='"+bfrom+"' where  email='"+email+"'");
				
				String query1=("update booking set bto='"+bto+"' where email='"+email+"'");
				
				PreparedStatement S = con.prepareStatement(query);
				
				PreparedStatement S1 = con.prepareStatement(query1);

				S.executeUpdate();
				
				S1.executeUpdate();
		
				con.close();
				}
			
			
				catch(Exception e)
				{
					System.out.println(e);
				}
				
			
		System.out.println("You have book flight from "+bfrom +" to "+bto+ " successful");
		
		System.out.println("Enter 1 too go on login page");
		
		int x = sc.nextInt();
		if(x==1) {
		login.login1();
		}
		else {
			System.out.println("Enter right choice");
		}
	}
	
}
