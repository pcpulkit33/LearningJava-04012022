package day1;
import java.util.Random;  


public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();   

		int x = random.nextInt(50);
		int y = random.nextInt(1000);
		
		System.out.println("The ramdom value of x is :" + x);
		System.out.println("The ramdom value of y is :" + y);
		
		//random character
		Random r = new Random();
		char c=(char)(r.nextInt(26) + 'a');
		System.out.println("Random character is "+ c + "ul");
	}
}

