abstract class Shape1{
    String objectName = " ";
    Shape1(String name)
    {
        this.objectName = name;

 

 

 

    }
    public void moveTo(int x ,int y)
    {
        System.out.println(this.objectName +" "+ "has been moved to"+"x ="+ x +"and y =" +y);
    }
    //abstract method which will be implemented by its subclasses

 

 

 

    abstract public double area();
    abstract public void draw();
}

 

 
	class Rectangle extends Shape1
	{
		int length,width;
		Rectangle(int length,int width,String name)
		{
			super(name);
			this.length=length;
			this.width=width;
			
			
		}
		public void draw()
		{
			System.out.println("rectangle has been drawn");
			
		}
		public double area()
		{
			return (double)(length*width);
			
		}
	}
	class Circle extends Shape1
	{
		double pi=3.14;
		int radius;
		Circle(int radius,String name)
		{
			super(name);
			this.radius=radius;
			
		}
		public void draw()
		{
			System.out.println("circle has been drawn");
			
		}
		public double area()
		{
			return (double)((pi*radius*radius)/2);
			
		}
	}
	
public class AbstractDemo1 {

	public static void main(String[] args) {
		Shape1 rect=new Rectangle (2,3,"rectangle");
		rect.draw();
		System.out.println("area of rectangle is"+rect.area());
		rect.moveTo(1,2);
		System.out.println(" ");
		
		Shape1 cir=new Circle(2,"circle");
		cir.draw();
		System.out.println("area of circle is"+cir.area());
		cir.moveTo(2, 4);
		
		
		
		

	
}
}
