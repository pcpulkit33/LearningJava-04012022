
package day2;

import java.util.Random;

public class RandomValueExample2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] number = new int[100];
		
		for (int i=0; i < number.length; i++) {
			number[i] = random.nextInt(10);
		}
		
		int count[] = new int[10];
		
		for(int i=0; i < number.length; i++) {
			count[number[i]]++;
		}
		
		for (int temp=0; temp < count.length; temp++) {
			System.out.println("value of " + temp + " is= "+  count[temp]);
		}
			
	}

}
