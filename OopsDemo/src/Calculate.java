

public class Calculate {
void sum()
{
	System.out.println("this is method overloading");
	
}
	void sum(int a,int b) {
		System.out.println("sum of two no's is" +(a+b));
		
	}
	 void sum(float a,float b)
	 {
		 System.out.println("sum of two no's is" +(a+b));
			
	 }
	 void sum(String a,String b) {
		 System.out.println("concatinanation of two no's is" +(a+b));
		
	}
	
	public static void main(String[] args) {
	Calculate cal=new Calculate();
	cal.sum();
	cal.sum(8,5);
	cal.sum(4.8f,7.8f);
	cal.sum("hello","world");

	}

}
