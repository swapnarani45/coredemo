
public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=new Circle1(10);
		Circle1 c=new Circle1(10);
		shape.draw();
		System.out.println("radius:"+c.getRadius());
		System.out.println("area="+shape.getArea());
		
	 shape=new Rectangle1(10,10);
	 
		shape.draw();
		System.out.println("area:"+shape.getArea());

	}

}
