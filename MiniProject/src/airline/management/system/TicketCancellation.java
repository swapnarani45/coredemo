package airline.management.system;
import java.util.Scanner;



public class TicketCancellation 
{
    int amount = 1000;
        Scanner s = new Scanner(System.in);

 

     

 

        void cancel(int n) 
        {
            
            // JDBC code to be written to fetch the details of the passenger
            System.out.println("enter 1 to cancel the ticket \n enter 2 to exit");
            int n2 = s.nextInt();
            if (n2 == 1) 
            {
                System.out.println("ticket has cancelled,money will be refunded within 2-3 working days");
                int deducted = amount - (int) (n*amount * 0.1);
                System.out.println("the final amount transfeered will be" + deducted);
            } 
            else if(n2 == 2)
            {
                System.out.println("have a safe journey");
            } 
            else
            {
                this.cancel(n);
            }
            

 

     

 

        }
    }