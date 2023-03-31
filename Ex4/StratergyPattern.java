package Ex4;

interface OperationStratergy {
	public int calculate(int num1, int num2);
}

class Add implements OperationStratergy {
	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}

class Subtract implements OperationStratergy {
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
}

class Multiply implements OperationStratergy {
	@Override
	public int calculate(int num1, int num2) {
		// System.out.println("multiplying....");
		return num1 * num2;

	}
}

class Context {

	private OperationStratergy operationStratergy;

	public void setOperation(OperationStratergy operationStratergy) {
		operationStratergy = this.operationStratergy;

	}

	public int executeOperation(int a, int b) {
		return operationStratergy.calculate(a, b);
	}

}

public class StratergyPattern {

	public static void main(String[] args) {
		int num1 = 100, num2 = 20;
		int stratergy = 1;
		int result = 0;

		Context context = new Context();

		if (stratergy == 1)
			context.setOperation(new Add());

		else if (stratergy == 2)
			context.setOperation(new Subtract());

		else if (stratergy == 3)
			context.setOperation(new Multiply());

		result = context.executeOperation(num1, num2);
		System.out.println(result);

	}
}
