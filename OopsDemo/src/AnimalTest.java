class Animal{
	String name;
	public void eat() {
		System.out.println("I can eat");
		}
}

class Dog extends Animal{
	public void display()
	{
   System.out.println("my name is" + name);
	}


	public void eat() {
		
	}
	
		
	}
public class AnimalTest {

	public static void main(String[] args) {
		Dog labrador=new Dog();//create new object for class
		labrador.display();
		labrador.eat();
		
	}

}
