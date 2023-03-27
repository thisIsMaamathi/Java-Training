package Ex4;

public class ComandPattern {

	public static void main(String args[]) {
		Addition add = new Addition();
        Subtraction sub=new Subtraction();
      
        
		CalculatorApp calcy = new CalculatorApp();

		calcy.setCommand(1, new AddCommand(add,2,3));
		calcy.setCommand(2, new SubtractCommand(sub,20,3));
		


		calcy.executeCommand(2);

	}
}

class CalculatorApp {
	Command c[] = new Command[5];

	public CalculatorApp() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Command() {
				@Override
				public void execute() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}

	public void executeCommand(int slot) {
		c[slot].execute();
	}

	public void setCommand(int slot, Command cc) {
		c[slot] = cc;
	}
}

abstract class Command {
	Addition add;

	public abstract void execute();
}

class AddCommand extends Command {
	int a, b;
	Addition add;

	public AddCommand(Addition add, int a, int b) {

		this.a = a;
		this.b = b;
		this.add = add;

	}

	@Override
	public void execute() {
		System.out.println("add command initiated....");
		add.addOperation(add, a, b);

	}
}

class SubtractCommand extends Command {
	int a, b;
	Subtraction sub;

	public SubtractCommand(Subtraction sub, int a, int b) {
	
		this.a = a;
		this.b = b;
		this.sub = sub;

	}

	@Override
	public void execute() {
		System.out.println("subtract command initiated....");
		sub.subtractOperation(sub, a, b);

	}
}


class Addition {
	public void addOperation(Addition add, int a, int b) {
		System.out.println("Adding num");
		System.out.println(a + b);

	}

}

class Subtraction {
	public void subtractOperation(Subtraction sub, int a, int b) {
		System.out.println("Subtracting num");
		System.out.println(a - b);

	}

}
