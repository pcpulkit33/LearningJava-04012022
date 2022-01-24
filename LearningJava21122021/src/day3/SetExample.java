package day3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> userName = new HashSet<>();  // store only unique values and does not maintains the order.

		userName.add("Pulkit");
		userName.add("Saurabh");
		userName.add("Ankit");
		userName.add("Gaurav");
		userName.add("Deepak");
		userName.add("Pulkit");

		for (String user : userName) {
			System.out.println(user);
		}

		System.out.println("-------------------------------------"); //maintains order

		Set<String> userName_linkSet = new LinkedHashSet<>();

		userName_linkSet.add("Pulkit");
		userName_linkSet.add("Saurabh");
		userName_linkSet.add("Ankit");
		userName_linkSet.add("Gaurav");
		userName_linkSet.add("Deepak");
		userName_linkSet.add("Pulkit");

		for (String user : userName_linkSet) {
			System.out.println(user);
		}

		System.out.println("-------------------------------------");

		Set<String> userNameTreeSet = new TreeSet<>(Collections.reverseOrder()); //sorted form

		userNameTreeSet.add("Pulkit");
		userNameTreeSet.add("Saurabh");
		userNameTreeSet.add("Ankit");
		userNameTreeSet.add("Gaurav");
		userNameTreeSet.add("Deepak");
		userNameTreeSet.add("Pulkit");

		for (String user : userNameTreeSet) {
			System.out.println(user);
		}

	}
}
