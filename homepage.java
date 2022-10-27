package AirlineReservationSystem;

import java.util.Scanner;

public class homepage {

	public static void main(String[] args) throws Exception {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("*************************PRASHANTS AIRLINE***************************** ");
			
			System.out.println(" Enter 1 for login ");

			System.out.println(" Enter 2 for New registration "); 
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				login.login1();
			break;
			
			case 2:System.out.println("Register your information");
				registration.registration1();
			break;
			
			default:System.out.println("Enter valid choice");
			}
		}
	}
}
