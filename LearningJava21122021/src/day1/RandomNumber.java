package day1;
import java.util.Random;  


public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();   

		int x = random.nextInt(50);
		int y = random.nextInt(1000);
		
		System.out.println("The ramdom value of x is :" + x);
		System.out.println("The ramdom value of y is :" + y);
	}

}
