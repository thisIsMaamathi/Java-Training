package Ex4;

interface Operation {
	public int calculate(int num1, int num2);
}

class Add implements Operation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}

class Subtract implements Operation {
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
}

class Multiply implements Operation {
	@Override
	public int calculate(int num1, int num2) {
		// System.out.println("multiplying....");
		return num1 * num2;

	}
}

public class StratergyPattern {

	// define multiple algorithms and let client(main function) application pass the
	// algorithm to be used as a parameter
	public static void main(String[] args) {

		Operation operation = new Add();
		System.out.println(operation.calculate(10, 5));

		Operation operation2 = new Subtract();
		System.out.println(operation2.calculate(10, 5));

		Operation operation3 = new Multiply();
		System.out.println(operation3.calculate(10, 5));

	}
}
