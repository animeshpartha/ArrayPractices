package LinkedList;

import java.util.LinkedList;

public class PracticeLinkedList {

	public static void main(String[] args) {
		//LinkList class uses double Linked List to store the elements
		//In Linked List manipulating of data very fast (deleting or inserting data)
		//can contain duplicate elements
		
		LinkedList<String> countryNames = new LinkedList<String>();
		
		countryNames.add("Bangladesh");
		countryNames.add("India");
		countryNames.add("Pakistan");
		countryNames.add("Nepal");
		countryNames.add("Bhutan");
		countryNames.add(5, "United Kingdom");
		countryNames.addFirst("Japan");
		countryNames.addLast("China");
		countryNames.remove("Pakistan");
		countryNames.remove(2);
		//countryNames.removeAll(countryNames);
		//countryNames.removeFirst();
		//countryNames.removeLast();
		
		System.out.println("First Elements: " +countryNames.getFirst());
		System.out.println("Last Elements: " +countryNames.getLast());
		
		for (String country : countryNames) {
			System.out.println(country);
		}
			
		//System.out.println(countryNames);
		
		System.out.println("Size of the Linked List: "+countryNames.size());
		
		countryNames.clear();
		System.out.println(countryNames);
	}
}
