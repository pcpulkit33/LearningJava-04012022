package day2;

public class Cylinder extends Shape {

	@Override
	public double calculateArea(int side) {
		
		return Math.PI * side * side;
	}
	
}