package Ex1R;

public class CheckPallindromePerfectArmstrong {
	public static void main(String args[]) {
		int num = 121;
		int n = num;
		int rem, rev = 0, sum = 0, sumPerfect = 0;

		while (num != 0) {
			rem = num % 10;
			
			rev = rev * 10 + rem; // palindrome
			sum += rem * rem * rem; // sum of square

			num /= 10;
		}

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				sumPerfect += i;
			}

		}

		if (n == rev)
			System.out.println("The number is a palindrome");

		if (n == sum)
			System.out.println("The number is a Armstrong number");

		if (n == sumPerfect)
			System.out.println("This is a perfect number");

	}
}
