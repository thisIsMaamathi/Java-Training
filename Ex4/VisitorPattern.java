package Ex4;

interface ItemElement {

	public int accept(ComputerAssembler ca);
}

class Monitor implements ItemElement {

	private int price;
	private String modelNumber;

	public Monitor(int cost, String modelNumber) {
		this.price = cost;
		this.modelNumber = modelNumber;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int accept(ComputerAssembler ca) {
		return ca.visit(this);
	}

}

class Keyboard implements ItemElement {

	private int price;
	private String modelNumber;

	public Keyboard(int cost, String modelNumber) {
		this.price = cost;
		this.modelNumber = modelNumber;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int accept(ComputerAssembler ca) {
		return ca.visit(this);
	}

}

interface ComputerAssembler {

	int visit(Monitor m);

	int visit(Keyboard k);
}

class ComputerAssemblerVisitorImpl implements ComputerAssembler {

	@Override
	public int visit(Monitor m) {
		int cost = 0;
		// apply 5$ discount if book price is greater than 50
		cost = m.getPrice();
		System.out.println("The cost of monitor =" + cost);
		return cost;
	}

	@Override
	public int visit(Keyboard k) {
		int cost = 0;
		cost = k.getPrice();
		System.out.println("The cost of keyboard =" + cost);
		return cost;
	}

}

public class VisitorPattern {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Monitor(20000, "1234"), new Monitor(100000, "5678"),
				new Keyboard(1010, "20987"), new Keyboard(5000, "65989") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ComputerAssembler ca = new ComputerAssemblerVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(ca);
		}
		return sum;
	}

}