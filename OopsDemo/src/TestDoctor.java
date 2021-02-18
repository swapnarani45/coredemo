
public class TestDoctor {

 

    public static void main(String[] args) {
       
        Specialist spobj=new Specialist("TONY",554,"Newyork","Medicine");
        spobj.display();
        System.out.println();
        
        NonSpecialist obj=new NonSpecialist("Mary",552,"Manila");
        obj.display();
    }

 

}
 