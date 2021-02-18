package airline.management.system;
import java.util.Scanner;



public class Ticket 
{
    String source, destination;
    public int n;
    
    
    Scanner in = new Scanner(System.in);
    
    Ticket()
    {        
    }
    
    void flightSearch()
    {
        int y, d, m;
        String from, to, flight;
        int choice,year,month,day;
           
       
           System.out.println("press 1- for International flight");
           System.out.println("press 2- for Domestic flight");
           choice = in.nextInt();
   switch(choice) 
   {
   
   case 1:
       flight="International";
       System.out.println("Source:");
       from = in.next();
       System.out.println("Destination:");
       to = in.next();
       break;
       
       case 2:
           flight="Domestic";
           System.out.println("Source:");
           from = in.next();
           System.out.println("Destination");
           to = in.next();
           break;
           
       default:
           System.out.println("Enter proper choice");
               
   }
   
    System.out.println("Enter the date of traveling");
    System.out.println("day");
    d = in.nextInt();
    System.out.println("month");
    m = in.nextInt();
    System.out.println("year");
    y = in.nextInt();
   
   System.out.println("These are the available flights:");
   // from database
   
   
   System.out.println("Press 1 - flight booking");
   System.out.println("Press 2 - exit");
   
   int option = in.nextInt();
   
   switch(option)
   {
   case 1:
       System.out.println("************ Flight Booking ************");
       this.flightBooking();
       break;
       
   case 2:
       break;
       
   default:
       System.out.println("Enter valid Key");
           
   
    }
    }
   
   
   void flightBooking()
   {
       int seat_available=12;
       System.out.println("Enter no of passengers");
       n=in.nextInt();
            
            if( n <  seat_available)
           {
                int age[]= new int[n];
                String name[] = new String[n];
                String gender[] = new String[n];
                    
                for(int i=0;i<n;i++)
                {
                    System.out.println("Enter details of passenger " +i);
                    System.out.print("Enter Name:  ");
                    name[i]=in.next();
                    System.out.println();
                    System.out.print("Enter age:  ");
                    age[i]=in.nextInt();
                    System.out.println();
                    System.out.print("Enter gender:  ");
                    gender[i]=in.next();
                    System.out.println();
                                    
                }
                
            
            System.out.println("Your price for "+n+" ticket is : Rs"+n*3000);
            System.out.println("\n******** Payment **********");
            this.payment();
           }
            else
            {
                System.out.println(n+" seats are not available");
                System.out.println("Press 1 - Flight Search");
                System.out.println("Press 2 - exit");
                int next = in.nextInt();
                
                if(next == 1)
                    this.flightSearch();
                
            }
            
   }
   
   void payment()
   {
       String uname = "username";
       String pass = "password";
       String username, password;
       int retry = 3;
       
       
       System.out.println("Total Amount: "+n*3000);
       System.out.println("Press 1 - continue Payment");
          System.out.println("Press 2 - exit");
          int next = in.nextInt();
          
          if(next == 1)
          {
           System.out.println("Please select a payment mode"); 
        System.out.println("Press 1 - Net Banking\nPress 2 - e-Wallet");
        int paymentMethod = in.nextInt();
        
        if (paymentMethod == 1 || paymentMethod == 2) {
                
    
        	String user="username";
        	String password="password";
        	String username,password;
        	Scanner sc=new Scanner(System.in);
        	do {
        	System.out.println("Enter user Id :");
        	username=sc.next();
        	System.out.println("Enter password :");
        	password1=sc.next();
        	}while(!(user.contentEquals(username) && pass1.contentEquals(password)));
             
         }
     
     
     
     System.out.println("Payment Done");
     System.out.println("\n Ticket Booked !!!");
     
              
          }
        else if(next == 2)
        {
            
        }
        else
        {
            this.payment();
        }
       
       
       
       
   }
        
    }
    

 

}
 