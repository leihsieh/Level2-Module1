package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("First");
		strings.add("Second");
		strings.add("Third");
		strings.add("Fourth");
		strings.add("Fifth");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String s = strings.get(i);
			System.out.println("The string at position " + i + ": " + s);
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < strings.size(); i++) {
			if(i % 2 ==0) {
				System.out.println(strings.get(i));
			}
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for(int i = 4; i > -1; i--) {
			System.out.println(strings.get(i));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < strings.size(); i++) {
			if(strings.get(i).contains("e")) {
				System.out.println(strings.get(i));
			}
		}
	}
}
