package day2;

import java.util.Random;

public class RandomValuesExample {

	public static void main(String[] args) {

		Random random = new Random();

		int[] numbers = new int[20];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = random.nextInt(2);
		}

		for (int temp : numbers) {
			System.out.println(temp);
		}

		// wap to count the 0's and 1's	
		int count0 = 0;
		int count1 = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				count0++;
			} else {
				count1++;
			}
		}
		System.out.println("Count of 0 is " + count0);
		System.out.println("Count of 1 is " + count1);
	}
}