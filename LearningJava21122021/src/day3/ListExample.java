package day3;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		
		List<Integer> arraylist; 
		
		arraylist = new ArrayList<>();
		
		arraylist.add(20);
		arraylist.add(90);
		arraylist.add(1, 1);
		arraylist.add(2, 30);
		arraylist.add(100);
	
		System.out.println(arraylist.size());
		System.out.println("-----------------------------------");
		
		for(Integer temp : arraylist ) {
			System.out.println(temp);
		}
		
		
	}

}
