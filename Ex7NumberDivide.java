package Ex2R;


import java.util.Scanner;

public class Ex7NumberDivide {
	public static void main(String arg[]) {
		String num, d;
		Scanner sc = new Scanner(System.in);
		NumberOperation n = new NumberOperation();
		for (int i = 0; i < 3; i++) {
			num = sc.next();
			if (num.charAt(0) == 'q' || num.charAt(0) == 'Q') {// b
				System.out.println("Exiting......");
				System.exit(0);
			}

			d = sc.next();
			n.divide(num, d);

		}
		sc.close();
		System.out.println("scanner closed");

	}

}

class NumberOperation {

	public void divide(String n, String d) {
		int res;

   

		try {

			int a = Integer.parseInt(n);
			int b = Integer.parseInt(d);
			//System.out.println("in try");
			res = a / b;
			System.out.println(res);

		} catch (ArithmeticException e) {
		
			System.out.println("Cannot divide by Zero");
		}

		catch (NumberFormatException e) {

			System.out.println("Enter valid integer");
		}

	}

}


