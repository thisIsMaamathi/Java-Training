package Ex2R;

import java.util.Scanner;


public class Ex9MarksAverage {

	public static void main(String args[])  {
		Student s = new Student();
		s.calcAvg();
	}

}

class Student {

	public void calcAvg() {
		float avg = 0f, m = 0, sum = 0;
		int count=0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; count < 10; i++) {
			String mark = sc.next();

			try {

				m = Float.parseFloat(mark);
				if (m < 0)
					throw new NegativeNumberException("Enter a positive value");
				if (m > 100)
					throw new InvalidRangeException("Range is only till 100");
				sum += m;
				count++;
//				System.out.println("the sum" + sum);

			} catch (NumberFormatException e) {
				System.out.println("Enter a valid integer");
			}
			catch (NegativeNumberException e) {
				System.out.println(e);
			}
			catch (InvalidRangeException e) {
				System.out.println(e);
			}

		}
		System.out.println(sum);
		System.out.println(sum / 10);

		avg = sum / 10;
		System.out.println("The avg is " + avg);

	}
}

class NegativeNumberException extends Exception {

	NegativeNumberException(String n) {
		super(n);
	}
}

class InvalidRangeException extends Exception{
		
		InvalidRangeException(String n){
			super(n);
		}
		
	
	
	
	
	
}