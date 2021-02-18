import java.util.Scanner;
public class GreatestThree {

	public static void main(String[] args) {
		System.out.println("enter a number");
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if (a>b && a>c )
			System.out.println("a is greatest");
		else if (b>c)
			System.out.println("b is greatest");
		
	     	else 
			System.out.println("c is greatest");
		 

	}

}
