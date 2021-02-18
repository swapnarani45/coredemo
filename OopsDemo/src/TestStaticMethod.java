class Student200
{
	private int rollno;
	private String name;
	static String college="BMS";
	
	public static void changeCollege()
	{
		college="SNIST";
		
	}
	public Student200(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+"" +college);
	}
	
}

public class TestStaticMethod {

	public static void main(String[] args)
	{
		Student200.changeCollege();//calling static method without creating object
			Student200 s1=new Student200(101,"shaik");
			Student200 s2=new Student200(109,"hameeda");
			Student200 s3=new Student200(109,"hameeda");
			s1.display();
			s2.display();
			s3.display();
	}

}
