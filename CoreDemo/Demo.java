import java.io.Console;

public class Demo{

	public static void main(String[] args) {
		Console c=System.console();
		String username=c.readLine("Enter userName");
		char ch[]=c.readPassword("Enter password");
		String pass=new String(ch);
		System.out.println(username +" "+ pass);
	
	}
}
