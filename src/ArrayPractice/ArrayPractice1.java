package ArrayPractice;

public class ArrayPractice1 {

	public static void main(String[] args) {
		
		int [] number = new int[6];
	
		
		number[0] = 10;
		number[1] = 11;
		number[2] = 12;
		number[3] = 13;
		number[4] = 14;
		number[5] = 15;
			
		int len = number.length;
		System.out.println("Array size: " +len);
		
		int sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5];
		System.out.println("Sum: " +sum);
		
	}

}
