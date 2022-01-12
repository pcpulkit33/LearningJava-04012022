package day2;

public class DemoShape {

	public static void main(String[] args) {
		
		Shape cylinder = new Cylinder();
		double VolofCylinder = cylinder.calculateVolume(10, 10);
		System.out.println("Cylinder Vol. is ="+ VolofCylinder);
		
		Shape cuboid = new Cuboid();
		double Volofcuboid = cuboid.calculateVolume(10, 10);
		System.out.println("Cuboid Vol. is = "+ Volofcuboid);
	}

}
