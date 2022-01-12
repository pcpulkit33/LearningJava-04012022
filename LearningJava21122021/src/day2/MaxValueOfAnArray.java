package day2;

public class MaxValueOfAnArray {

	public static void main(String[] args) {
		
		int[] number = new int[10];
		number[0] = 10;
		number[1] = 15;
		number[2] = 17;
		number[3] = 18;
		number[4] = 12;
		
		int max = number[0];
		
		for (int num = 1; num < number.length; num ++) {
			if (max < number[num]) {
				max = number[num];
			}
		}
		
		System.out.println("Maximun number is "+ max);
				
	}
}
