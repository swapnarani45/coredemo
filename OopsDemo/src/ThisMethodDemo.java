//program that explains method accessing using this key word
public class ThisMethodDemo {
	
	    public void getName() 
	    {
	     System.out.println("Java Programming");
	    }

	 

	    public void display()
	    {
	     this.getName();
	    }
	public static void main(String[] args) {
		  ThisMethodDemo d = new ThisMethodDemo();
	        d.display();
	}

}
