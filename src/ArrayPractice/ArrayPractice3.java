package ArrayPractice;

import java.util.Scanner;

public class ArrayPractice3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[5];
		double sum = 0;
		
		System.out.print("Please enter 5 number: ");
		
		for (int i = 0; i < 5; i++) {
		number[i] = input.nextDouble();
		System.out.println(number[i]);
	
		}
		
		for (int j = 0; j < 5; j++) {
			sum = sum + number[j];  //instead of number 5
		}
		System.out.println("The sum is: "+sum);
		
		
		double avg = sum/5; 
		
		System.out.println("The Avarage is: "+avg);

	}

}
