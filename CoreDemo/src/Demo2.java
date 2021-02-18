import java.util.Scanner;
public class Demo2 {
	
	public static void main(String[] args) {
		
		int a,netsalary,Basic,HRA = 0,DA = 0,PF;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name of the employee");
		String name=s.nextLine();
		
		System.out.println("enter the empID");
		int empID=s.nextInt();
		
		System.out.println("Enter the values of HRA,DA,PF ");
		
		
		
		int salary= s.nextInt();
		
		 
		netsalary=(Basic+HRA+DA)-PF;
		System.out.println("the netsalary is"+netsalary);
		
		
		
		
		
		
		

	}

}
