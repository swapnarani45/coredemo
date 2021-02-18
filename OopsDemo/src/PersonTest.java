
public class PersonTest {

	public static void main(String[] args) {
		Person objPerson1=new Person();// invoke default constructor
		Person objPerson2=new Person("swapna",23,"Wardannapet");
		Person objPerson3=new Person("Harish",28,"Parkal");//invoke parameterised constructor
		objPerson1.input();
		objPerson1.print();
		objPerson2.print();
		objPerson3.print();
	}

}
