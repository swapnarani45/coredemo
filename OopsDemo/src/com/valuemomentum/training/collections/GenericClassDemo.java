package com.valuemomentum.training.collections;
class Sample <T>//generics
{
	private T data;

	public T getData() {
		return data;
	}
	

	public Sample(T data) {
		super();
		this.data = data;
	}


	public void setData(T data) {
		this.data = data;
	}
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {
		
		Sample<Integer> s1=new Sample<Integer>(15);//creating an object for a generic class
		s1.setData(15);
		System.out.println("displaying data from data type: "+s1.getData());
		
		Sample<String> s2=new Sample<String>("JAVA GENERICS");
		s2.setData("Java Generics");
		System.out.println("displayingdata of String type"+s2.getData());
		
		Sample<Float> s3=new Sample<Float>();
		s3.setData(12.45f);
		System.out.println("displaying data of float type"+s3.getData());
	}

}
