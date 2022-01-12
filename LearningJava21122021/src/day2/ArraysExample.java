package day2;

public class ArraysExample {

	public static void main(String[] args) {

		// Declaration of array
		int[] number = new int[5];

		// assign a value to array
		number[0] = 10;
		number[1] = 15;
		number[2] = 17;
		number[3] = 18;
		number[4] = 12;

		// Enhanced for loop which works only on collections (arrys, list, etc)
		for (int temp : number) {

			System.out.println(temp);
		}

		System.out.println(number[3]);

		// Another way of declaration
		int[] arr = { 5, 6, 7, 8, 9 };

		// iteration of an array or traditional for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}