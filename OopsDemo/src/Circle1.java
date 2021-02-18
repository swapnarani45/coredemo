public class Circle1 implements Shape {
    
    private double radius;

 

    public Circle1(double radius) {
        super();
        this.radius = radius;
    }

 

    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Drawing Circle");

 

    }

 

    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI*this.radius*this.radius;
    }
    
    public double getRadius()
    {
        return this.radius;
    }

 

}
 