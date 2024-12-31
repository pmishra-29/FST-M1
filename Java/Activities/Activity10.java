package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("P");
		hs.add("R");
		hs.add("E");
		hs.add("E");
		hs.add("T");
		hs.add("I");

		// Print HashSet
		System.out.println("The elements of the Set are : " + hs);

		// Print Size of the HashSet
		System.out.println("The size of the Set is : " + hs.size());

		// Remove element
		System.out.println("Remove element 'P' from the set : " + hs.remove("P"));

		// Remove element that does not exist in the set
		if (hs.remove("A")) {
			System.out.println("Element 'A' removed from the set");
		} else {
			System.out.println("Element 'A' does not exist in the Set !");
		}

		// Search for element E in the set
		System.out.println("Checking if 'E' exists in the Set... : " + hs.contains("E"));

		// Printing updated Set
		System.out.println("The elements of the Set are : " + hs);
	}
}