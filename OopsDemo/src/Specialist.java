
public class Specialist extends Doctor {
	protected String speciality;
	Specialist()
	{
		
	}
	
		Specialist(final String str,final int num,final String add,final String special){
			super(str,num,add);
			speciality=special;
			
			
		
	}
		void display() {
			super.display();
			System.out.println("the speciality is"+speciality);
			
		}
		
}
