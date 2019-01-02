package ArrayPractice;

import java.util.HashMap;

public class HashmapPractice {
	public static void main(String[] args) {
	
		//Array= to store data from index
		
		//HashMap= (Key,Value)-- All the value under the key
		
		
		HashMap <Integer,String> customer = new HashMap <Integer,String>();   //<>--Angle bracket
		//put means to insert the data
		//get means to run the data
		
		customer.put(101, "Information: a. Partha, b. SSN");
		customer.put(102, "Information: a. Hasan, b. State ID");
		customer.put(103, "Information: a. Najibah, b. Certificate");
		customer.put(104, "Information: a. Farhana, b. Eat all the day");
		customer.put(105, "Information: a. Lazim, b. Every time on the phone");
		customer.put(106, "Information: a. Orfatt, b. Good Student");
		
		for (int i=101; i<=106; i++)  //using Loop
		
		
		System.out.println(customer.get(i)+ " ");
		
		
		/*System.out.println(customer.get(102));
		System.out.println(customer.get(103));
		System.out.println(customer.get(104));
		System.out.println(customer.get(105));
		System.out.println(customer.get(106));*/
		
		
	}

}
