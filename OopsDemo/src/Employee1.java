public class Employee1 {
    
    String name,address;
    int salary,year;
    Employee1(){
        
    }
    Employee1(String n,String addr,int yr,int sal){
        this.name=n;
        this.address=addr;
        this.year=yr;
        this.salary=sal;
        
    }

 

    void display() {
        
        System.out.print(this.name+"       ");
        System.out.print(this.year+"        ");
        System.out.print(this.address+"    ");
        System.out.print(this.salary+"    ");
        System.out.println();
    }
    public static void main(String[] args) {
    
        Employee1 ob1=new Employee1("Robert","64C- WallsStreet",1994,78000);
        Employee1 ob2=new Employee1("Sam   ","68D- WallsStreet",2000,98989);
        Employee1 ob3=new Employee1("John  ","26B- WallsStreet",1999,87978);
        System.out.print("Name "+"    ");
        System.out.print("Year of joining "+"    ");
        System.out.print("Address "+"       ");
        System.out.print("Salary ");
        System.out.println();
        ob1.display();
        ob2.display();
        ob3.display();

 

    }

 

}