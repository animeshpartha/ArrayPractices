package ArrayPractice;

import java.util.Scanner;

public class ArrayPractice2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] number = new double[5];
		double sum = 0;
		
		System.out.print("Please enter 5 number: ");
		
		number[0] = input.nextDouble();
		number[1] = input.nextDouble();
		number[2] = input.nextDouble();
		number[3] = input.nextDouble();
		number[4] = input.nextDouble();
		
		sum = number[0] + number[1] + number[2] + number[3] + number[4];
		System.out.println("The sum is: " +sum);
		
	}

}
