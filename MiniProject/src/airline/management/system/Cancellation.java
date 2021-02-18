package airline.management.system;

import java.util.Scanner;

public class Cancellation {
	int amount = 1000;
	Scanner s = new Scanner(System.in);

	void Display() {
		System.out.println("enter the passenger number");
		int n = s.nextInt();
		System.out.println("show the details of the passenger");
		
		// JDBC code to be written to fetch the details of the passenger
		System.out.println("enter 1 to cancel the ticket \n enter 2 to exit");
		int n3 = s.nextInt();
		if (n3 == 1) {
			System.out.println("ticket has cancelled,money will be refunded within 2-3 working days");
			int deducted = amount - (int) (amount * 0.1);
			System.out.println("the final amount transfeered will be" + deducted);
		} else if (n3 == 2) {
			System.out.println("have a safe journey");
		} else {
			System.out.println("please enter a valid number");
			this.Display();
		}

	}
}

