import java.util.Scanner;
public class DemoFor1 {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no");
		int n=scan.nextInt();
		for(i=1;i<=n;i++)
			sum=sum+i;
		System.out.println("sum of series" +sum);
			
		
	}

}
