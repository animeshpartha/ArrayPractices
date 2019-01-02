package ArrayPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("Size =" +number.size());
		
		
		number.add(10);
		number.add(15);
		number.add(20);
		number.add(3,25);
		
		//creating iterator
		
		Iterator itr = number.iterator();   //{iterator= **it has method to loop through the list**}
		while(itr.hasNext()){
			System.out.print(" "+itr.next());
		}
		
		
		//for (int x : number) {
			//System.out.print(" "+x);}
		
		/*REMOVING elements
		number.remove(2);
		System.out.println("After removing Array List: "+number);
		
		number.removeAll(number);
		System.out.println("After removing All Array List: "+number);
		
		System.out.println(number);
		System.out.println();	
		System.out.println("Arraylist Contains :" +number.size() );*/
		
		

	}

}
