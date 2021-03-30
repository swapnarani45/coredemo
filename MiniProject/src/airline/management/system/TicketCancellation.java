
package airline.management.system;

import java.util.Scanner;
import java.sql.*;

public class TicketCancellation {
	int amount = 0;
	Scanner s = new Scanner(System.in);
	Connection con;
	Statement stmt1;
	ResultSet rs;

	void cancel(int n) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc", "root", "95Phs@143");
			Statement stmt = con.createStatement();
			
			// JDBC code to be written to fetch the details of the passenger
		     rs = stmt.executeQuery("select * from passengers");
		     while(rs.next()) {
		    	 System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "
		 				+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
		 					
		     }
		     rs=stmt.executeQuery("select amount from payments where pass_uID="+n);
		     amount=rs.getInt(1);
			System.out.println("enter 1 to cancel the ticket \n enter 2 to exit");
			int n2 = s.nextInt();
			if (n2 == 1) {
				System.out.println("ticket has cancelled,money will be refunded within 2-3 working days");
				int deducted = amount - (int) (n * amount * 0.1);
				System.out.println("the final amount transfeered will be" + deducted);
			} else if (n2 == 2) {
				System.out.println("have a safe journey");
			} else {
				this.cancel(n);

			}

		} catch (Exception e) {

			
			System.out.println(e);
		}
	}

}
