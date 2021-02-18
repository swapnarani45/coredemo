package airline.management.system;
import java.util.Scanner;

public class AirGo {
	public static void main(String[] args) 
    {
        
		Scanner sc = new Scanner(System.in);
        int passengers = new Ticket().n;
        System.out.println("Press 1 - Booking Ticket");
        System.out.println("Press 2 - Ticket Cancellation");
        System.out.println("Press 3 - exit");
        
        
        int choice = sc.nextInt();
        
        if(choice == 1)
            new Ticket().flightSearch();
        else if(choice == 2)
        {
        	new TicketCancellation().cancel(passengers);
        }
        else
        {
            
        }
        
        
        

 

    }

 

}
     



