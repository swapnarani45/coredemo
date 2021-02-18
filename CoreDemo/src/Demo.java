import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int s1,s2,s3,s4,total,avg;
		System.out.println("enter the name of the student");
		String name=s.nextLine();
		System.out.println("Enter the rollno");
		int rollno=s.nextInt();
		System.out.println("enter the marks of the subjects");
		 s1=s.nextInt();
		 s2=s.nextInt();
		 s3=s.nextInt();
		 s4=s.nextInt();
		 
		 total=s1+s2+s3+s4;
		 avg=total/4;
		 if(avg>=70) {
			 System.out.println("distinction");
		 }
		 else if(avg>=60) {
			 
		 
			 System.out.println("first class");}
		 else if(avg>=50) {
			 System.out.println("second class");
		 }
		 
		 
		

}
}