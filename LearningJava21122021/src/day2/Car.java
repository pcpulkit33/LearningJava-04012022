package day2;

public class Car extends Machine {
	
	public Car() {
		
//explicitly calling the explicit constructor when impicit constuctor is not available in parent class i.e Machine class
		// super(3000);
		System.out.println("Car level constructor");
	}

	public void restart() {
		
		engineSize = 500;
		
		System.out.println("Restart");
	}

	public void breakingMachanism() {
		System.out.println("Break");
	}
	
	// Overriding Concept - CHange in implementation of a method(stop) in child(Car) class, 
	// Overridden method
	@Override
	public void stop() {
		System.out.println("Stop Implemented in car class ");
	}
}
