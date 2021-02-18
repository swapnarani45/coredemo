
public class Bike {
   
    final int SPEEDLIMIT = 910;
    void run()
    {
        //speedlimit = 400;
        System.out.println("The speed limit of bike :"+SPEEDLIMIT);
    }
   
    public static void main(String[] args)
    {
        Bike obj = new Bike();
        obj.run();
    }
}