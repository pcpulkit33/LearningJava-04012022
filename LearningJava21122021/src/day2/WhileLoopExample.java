package day2;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		//while loop are used when you don't have an idea of how many iterations are there
		
//		int i=5;
//		while(i > 0) {
//			System.out.println("Number");
//			i--;	
//		}
		
		//reverse number example
		
		int number = 123456789;
		
		int reverseNumber = 0;
			
		int temp;
		
		while (number !=0) {
			temp = number % 10;
			reverseNumber = reverseNumber * 10 + temp ;
			number = number / 10;
		}
		
		System.out.println("Reverse Number is = "+ reverseNumber);
	}
}


