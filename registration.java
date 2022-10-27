package AirlineReservationSystem;

import java.sql.*;
import java.util.Scanner;

public class registration {
public static void registration1() throws Exception {
	
	try (Scanner sc = new Scanner(System.in)) {
		
		System.out.print("Enter Your name :  ");
		String name = sc.next();
		
		System.out.print("Enter Your surname :  ");
		String surname = sc.next();
		
		System.out.print("Enter Your email :  ");
		String email = sc.next();
		
		System.out.print("Enter Your mobile :  ");
		String mobile = sc.next();
		
		System.out.print("Enter Your password :  ");
		String password = sc.next();
		
		System.out.print("Enter Your password again to confirm:  ");
		String cpassword = sc.next();
		
		if(password.equals(cpassword)) {
			
			try {
				
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Prashant@3721");
			
			String q5="insert into registration(name,surname,email,mobile,password) values(?,?,?,?,?)";
			
			String q6 = "insert into booking(name,surname,email) values(?,?,?)";
			
			PreparedStatement st5 = con.prepareStatement(q5);
			
			PreparedStatement w6 = con.prepareStatement(q6);
			
			st5.setString(1, name);
			
			st5.setString(2, surname);
			
			st5.setString(3, email);
			
			st5.setString(4, mobile);
			
			st5.setString(5, password);
			
			w6.setString(1, name);
			
			w6.setString(2, surname);
			
			w6.setString(3, email);
			
			st5.executeUpdate();
			
			w6.executeUpdate();
			
			System.out.println("Registration successful.");
			
			con.close();
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			login.login1();

		}
	}

	
}

}
