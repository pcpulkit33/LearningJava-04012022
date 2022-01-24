package day3;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {

			int[] arr = new int[5];

			arr[0] = 5;
			arr[1] = 5;
			arr[2] = 6;
			arr[3] = 7;
			arr[4] = 8;
			arr[5] = 9;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("exception occurred ......");
			e.printStackTrace();
			
			
		}
		System.out.println("after catch");

	}
}
