package Ex5;

import java.util.HashMap;
//This pattern is mainly used to reduce number of objects created and increase performance
//It is a structural pattern
public class FlyweightPatterns {
	
	public static void main(String[] args) {
		//creating yellow circle
		Shapes yellowCircle = ShapeFactory.getCircle("YELLOW");
		yellowCircle.draw();
		//again creating yellow circle,but here new object is not created since yellow circle already exists
		Shapes yellowCircle2 = ShapeFactory.getCircle("YELLOW");
		yellowCircle2.draw();
	    //new red circle is created since circle of red does not exists
		Shapes redCircle = ShapeFactory.getCircle("Red");
		yellowCircle.draw();
        //here the hashcode of yellowCircle and yellowCircle2 is the same since no new circle is created
		//thus here memory usage is optimized by restriction of similar objects' instantiation
		System.out.println(yellowCircle.hashCode());
		System.out.println(yellowCircle2.hashCode());

		System.out.println(redCircle.hashCode());
	}
}

//abstract class shape with methods to set color and draw a circle
abstract class Shapes {
	public abstract void setColor(String color);
	public abstract void draw();
}

//different type of available shapes declared with enum
enum ShapeType {
	SQUARE, CIRCLE, TRIANGLE
}

//concrete class implementation of the shapes class 
class Square extends Shapes {

	final ShapeType shape = ShapeType.SQUARE;
	private String color = null;

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
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
	public void draw() {
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
	public void draw() {
		System.out.println("Drawing triangle in " + color);
	}
}

//Shapes factory to create the shapes in mentioned type of color
class ShapeFactory

{   //Hashmap is used for optimized creation of objects
	private static final HashMap<String, Shapes> shapesMap = new HashMap<>();
    //creates the shape object and assigns color to it
	public static Shapes getSquare(String color) {
		//assigning key value and passing to hashmap
		String key = color + "-SQUARE";
		Shapes shape = shapesMap.get(key);
        //checking if the shape of the same type and color exists
		if (shape != null) {
			//if it exists,returning the existing shape
			return shape;
		} 
		else {//If it doesn't exist,creating a new shape
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
