import java.util.Arrays;
import java.util.Scanner;


public class ArraySumDemo {

	public static void main(String[] args) {
		int n=0; 
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements in the array");
		n=sc.nextInt(n);
		int a[]=new int[n];
		System.out.println("enter all the elements");
		for( int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			System.out.println("sum is"+sum);
		}
	}

}
