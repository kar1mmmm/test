package pekan2_2511532029;

import java.util.*;

public class ArrayList1_2511532029 {

	public static void main(String[] args) {
		// size of ArrayList 
		int n = 5;
		// Declaring the ArrarList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		// Appending new elements at the end of the list
		for (int i = 0; i<=n; i++)
			arrli.add(i);
		// printing elements
		System.out.println(arrli);
		// remove elements at the index 3
		arrli.remove(3);
		// Displaying the ArrayList
		// after deletion
		System.out.println(arrli);
		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}