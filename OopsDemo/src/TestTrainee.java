import java.util.Scanner;



class Trainee //class declaration
{
	int tId; //define properties
	String tName;
	String tech;
	float salary;
	float stipend;
	
	//define methods
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter ID,name,technology and salary");
		tId=s.nextInt();
		tName=s.next();
		tech=s.next();
		salary=s.nextFloat();
		
		}
	 float calculate()
	 {
		 stipend=salary-200;
		 return stipend;
	 }
	void display(){
		
			
			System.out.println("emp details");
			System.out.println("trainee ID"+tId);
			System.out.println("trainee name"+tName);
			System.out.println("trainee technology"+tech);
			//System.out.println("trainee salary"+salary);
	}

public static class TestTrainee {

	public static void main(String[] args) {
		Trainee t1=new Trainee();//creating object for trainee class
		Trainee t2=new Trainee();
		
		t1.input();
		t2.input();
		
		float s1=t1.calculate();
		float s2=t2.calculate();
		t1.display();
		
	System.out.println("stipend"+s1);
		t2.display();
		System.out.println("stipend"+s2);
		
		
		
		
	}
}
}
