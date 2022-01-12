package day2;

public class Machine {
	
	// Default Or Implicit constructor
	public Machine() {
		System.out.println("Machine level constructor");
	}
	
	// Parameterized Or Explicit constructor
	public Machine(int engineSize) {
		
		this.engineSize = engineSize;
		
		System.out.println("Machine level constructor");
	}
	
	int engineSize;

	public void start() {
		System.out.println("Start");
	}

	public void stop() {
		System.out.println("Stop");
	}

}
