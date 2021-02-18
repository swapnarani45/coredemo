package airline.management.system;

import java.util.Scanner;



public class Login1
{
    int input,retry = 3;
    String login1= "user", password1= "user";
    String login_id,password, repass; 
    int choice;
    
    void login_process()
    {
        System.out.println("Press 1 - login");
        System.out.println("Press 2 - sign up");
        
        Scanner s = new Scanner(System.in);
        
        input = s.nextInt();
        
        switch(input)
        {
        case 1:
            System.out.println("Enter login_id: ");
            login_id = s.next();
            System.out.println("Enter Password: ");
            password = s.next();
            
            while(login_id != login1 && password==password1)
            {
                
                System.out.println("Login_id or Password is incorrect");
                System.out.println("Enter login_id: ");
                login_id = s.next();
                System.out.println("Enter Password: ");
                password = s.next();
                retry--;
                if( retry==0)
                        break;
            } 
                
            break;
        case 2:
            System.out.println("Enter login_id: ");
            login_id = s.next();
            System.out.println("Enter Password: ");
            password = s.next();
            break;
        default:
            System.out.println("Enter valid option");
            
            
            
        }
        
        System.out.println("Press 1 - Booking Ticket");
        System.out.println("Press 2 - Ticket Cancellation");
        System.out.println("Press 3 - exit");
        
                    
    }
    
}
 