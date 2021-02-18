
public class Doctor {
protected String name;
protected int Idnumber;
protected String Address;
 	Doctor(){
 	}	
 	
 	
 	Doctor(final String Str,final int num,final String add)
		{
 		name=Str;
 		Idnumber=num;
 		Address=add;
		}
 			

 	
 	void display() {
 		System.out.println("the name is"+ name);
 		System.out.println("the num is"+Idnumber);
 		System.out.println("the add is"+Address);
 		
 	}
}
