
public class Contact {
void createContact()
{
	System.out.println("this is method overloading");

}
void createContact(String name,int num)
{
	System.out.println("name is:"+name + "num is:"+num );
	
}
void createContact(String name,int a,int b)
{
	System.out.println("name is:"+name + "num1 is:"+a + "num2 is:"+b );
}
	public static void main(String[] args) {
		Contact con=new Contact();
		con.createContact();
		con.createContact("swapna",5678);
		con.createContact("prashasti", 123, 3456);

	}

}
