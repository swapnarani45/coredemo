
public class Time {
	int hour;
	int minute;
	int second;

	public Time(int h,int m,int s)
	{
		hour= h;
		minute= m;
		second= s;
		
	}
	void add(Time obj2) {
		this.hour +=obj2.hour;
		this.minute +=obj2.minute;
		this.second +=obj2.second;
		
}
	 void check() {
	        if(this.second>=60)
	        {
	            this.minute+=1;
	            this.second=this.second-60;
	        }
	        if(this.minute>=60)
	        {
	            this.hour+=1;
	            this.minute=this.minute-60;
	        }
	        if(this.hour>=24)
	        {
	            
	            this.hour=this.hour-24;
	        }
		
	}
	void display()
	{
		System.out.print("Addition is: ");
        System.out.println(this.hour+":"+this.minute+":"+this.second);
		
	}

	public static void main(String[] args) {
		Time obj1=new Time(10,45,60);
		Time obj2=new Time(3,55,05);
		obj1.add(obj2);
		System.out.println("the addition of time nos is");
		obj1.display();
		obj1.check();
}
}