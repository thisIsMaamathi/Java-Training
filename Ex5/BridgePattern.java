package Ex5;

public class BridgePattern {
//A structural design
//Allows to seperate abstraction(shape) from implementation(Coloring)
	public static void main(String args[]) {
		// object in the type of the abstract class created and the implementation is called along with it
		Shape square = new Sqr(new Blue());
		square.draw();
	}
}

//interface ie implementation of color 
interface Coloring {
	// this method is meant to fill color to a shape
	void fill();
}

class Blue implements Coloring {
	@Override
	public void fill() {
		System.out.println("Color is Blue");
	}
}

//the abstract class which represents shape
abstract class Shape {
	protected Coloring color;
	abstract public void draw();
}

class Sqr extends Shape {
	public Sqr(Coloring color) {
		this.color = color;
	}
	@Override
	public void draw() {
		System.out.println("Square drawn");
		color.fill();
	}
}