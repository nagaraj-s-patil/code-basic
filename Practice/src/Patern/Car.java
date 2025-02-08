package Patern;

class Car extends vehicle{ 
	public Car() { 
		this("Black"); 
		System.out.println("Red"); 
	} 
	public Car(String clr) { 
		this(125000); 
	} 
	public Car(int price) { 
		super(); 
	} 
	public static void main(String[] args) { 
		Car c=new Car(); 
	} 
} 
