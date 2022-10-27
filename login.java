package AirlineReservationSystem;

import java.sql.*;
import java.util.Scanner;

public class login {
	

	public static void login1() throws Exception{
		
		System.out.println();
		System.out.println();
		System.out.println("You are on login Page");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter login credentials for login");
			
		System.out.print("Enter your email  :  ");
		String username = sc.next();
			
		System.out.print("Enter your password  :  ");
		String password = sc.next();
		
		try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Prashant@3721");
				
				Statement st=con.createStatement();
							
				String up="select * from registration where email='"+username+"' and password='"+password+"'";
				
				ResultSet rs=st.executeQuery(up);
				
				if(rs.next()== true) {
					
					System.out.println("login auccessfull.");
					System.out.println();

				System.out.println("Enter 1 for Checking travel details");
				
				System.out.println("Enter 2 for New booking ");
				
				System.out.println("Enter 3 for cancel booking ");
				
				int choice = sc.nextInt();
				
				switch (choice) {
				
				case 1:{
					
					try {
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Prashant@3721");
						
						Statement st1=con1.createStatement();
						
					
					    String up2="select * from booking ";
					
					    ResultSet rs1=st1.executeQuery(up2);
					
						System.out.println("Name       Surname      From     To");
					    while(rs1.next()) {
					    	
					    	if(username.equals(rs1.getString("email"))) {
					    		
					System.out.println(rs1.getString(2)+"   "+rs1.getString(3)+"   "+rs1.getString(4)
								+"   "+rs1.getString(5));
					
					    	}
					    }
					}
					
					catch(Exception e)
					{
						System.out.println(e);
					}
					
					break;
					
					}
				
				case 2:{
					booking.booking1();
					break;
					}
				
				case 3:{
					cancel.cancel1();
					break;
				}
				
				default:System.out.println("Enter valid choice");
				}
			}
		
		else {
			System.out.println("Enter correct info");
			login.login1();
		}
		con.close();		
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
				
	}
	}


		




