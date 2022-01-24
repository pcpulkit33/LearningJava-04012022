package day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceComparisionArraylistAndLinklist {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		LinkedList<Integer> linkList = new LinkedList<>();
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i < 10E5; i++) {
			arrayList.add(0, 10);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("The diffenece in time is "+ (endTime - startTime) + " in ms");
		
		 startTime = System.currentTimeMillis();
		
		for(int i=0; i < 10E5; i++) {
			linkList.add(0, 10);
		}
		
		 endTime = System.currentTimeMillis();
		
		System.out.println("The diffenece in time is "+ (endTime - startTime) + " in ms");
		
		
	}
	
	
}
