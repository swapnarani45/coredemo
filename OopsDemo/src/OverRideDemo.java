class Bank
{
	int getRateOfInterest()
	{
		return 0;
				
	}}
class SBI extends Bank
{
	int getRateOfInterest() {
		return 8;
	}
	
}
class ICICI extends Bank
{
	int getRateOfInterest() {
		return 7;
	}
	
}
class Axis extends Bank
{
	int getRateOfInterest() {
		return 9;
	}
	
}

public class OverRideDemo {

	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("SBI rate of interest :"+s.getRateOfInterest());
		System.out.println("ICICI rate of interest :"+i.getRateOfInterest());
		System.out.println("AXIS rate of interest :"+a.getRateOfInterest());

	}

}
