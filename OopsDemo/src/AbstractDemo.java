abstract class Animal1{
	abstract void makeSound();
	public void eat()
	{
		System.out.println("I can eat");
		
	}
	
}
class Dog1 extends Animal1{
	//provide implementation for abstract class
	public void makeSound() {
		System.out.println("bark bark");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Dog1 d1=new Dog1();
		d1.makeSound();
		d1.eat();

	}

}
