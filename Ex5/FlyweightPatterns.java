package Ex5;

import java.util.HashMap;

public class FlyweightPatterns {
	public static void main(String[] args) {
		Shapes yellowCircle = ShapeFactory.getCircle("YELLOW");
		yellowCircle.draw("hi");
		Shapes yellowCircle2 = ShapeFactory.getCircle("YELLOW");
		yellowCircle2.draw("hi");
		
		Shapes redCircle = ShapeFactory.getCircle("Red");
		yellowCircle.draw("hi");

//		 
//		
//
		System.out.println(yellowCircle.hashCode());
		System.out.println(yellowCircle2.hashCode());

		System.out.println(redCircle.hashCode());
	}
}

abstract class Shapes {
	public abstract void setColor(String color);

	public abstract void draw(String content);
}

enum ShapeType {
	SQUARE, CIRCLE, TRIANGLE
}

class Square extends Shapes {

	final ShapeType shape = ShapeType.SQUARE;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing Square in " + color);
	}
}

class Circle extends Shapes {

	final ShapeType shape = ShapeType.CIRCLE;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing Circle in " + color);
	}
}


class Triangle extends Shapes {

	final ShapeType shape = ShapeType.TRIANGLE;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing triangle in " + color);
	}
}

	class ShapeFactory

	{
		private static final HashMap<String, Shapes> shapesMap = new HashMap<>();

		public static Shapes getSquare(String color) {
			String key = color + "-SQUARE";

			Shapes shape = shapesMap.get(key);

			if (shape != null) {
				return shape;
			} else {
				shape = new Square();
				shape.setColor(color);
				shapesMap.put(key, shape);
			}

			return shape;
		}

		public static Shapes getCircle(String color) {
			String key = color + "-CIRCLE";

			Shapes shape = shapesMap.get(key);

			if (shape != null) {
				return shape;
			} else {
				shape = new Square();
				shape.setColor(color);
				shapesMap.put(key, shape);
			}

			return shape;
		}

		public static Shapes getTriangle(String color) {
			String key = color + "-TRIANGLE";

			Shapes shape = shapesMap.get(key);

			if (shape != null) {
				return shape;
			} else {
				shape = new Square();
				shape.setColor(color);
				shapesMap.put(key, shape);
			}

			return shape;
		}
	}


