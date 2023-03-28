package Ex5;

public class BridgePattern {

	public static void main(String args[]) {
		// a square with red color
		Shape square = new Sqr(new Blue());
		square.draw();

	}
}

interface Color {
	void fill();
}

class Blue implements Color {
	@Override
	
	public void fill() {
		System.out.println("Color is Blue");
		
	}
}

abstract class Shape {
	protected Color color;

	

	// standard constructors

	abstract public void draw();
}

class Sqr extends Shape {

	public Sqr(Color color) {
		this.color=color;
		
	}

	@Override
	public void draw() {
		System.out.println( "Square drawn");
		color.fill();
	}
}