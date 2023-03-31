package Ex4;

abstract class Car {

	public abstract String getEngine();

	public abstract String getWheels();

	public abstract String getBody();

	@Override
	public String toString() {
		return "Engine= " + this.getEngine() + ",getWheels=" + this.getWheels() + ",Body=" + this.getBody();
	}
}

class Maruti800 extends Car {

	private String engine;
	private String wheel;
	private String body;

	public Maruti800(String engine, String wheel, String body) {
		this.engine = engine;
		this.wheel = wheel;
		this.body = body;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getWheels() {
		return this.wheel;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}

class WagonR extends Car {

	private String engine;
	private String wheel;
	private String body;

	public WagonR(String engine, String wheel, String body) {
		this.engine = engine;
		this.wheel = wheel;
		this.body = body;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getWheels() {
		return this.wheel;
	}

	@Override
	public String getBody() {
		return this.body;
	}

}

class CarFactory {

	public static Car getCar(String model, String engine, String wheel, String body) {
		if ("Maruti800".equalsIgnoreCase(model)) {
			System.out.println("Producing m800");
			return new Maruti800(engine, wheel, body);

		} else if ("WagonR".equalsIgnoreCase(model)) {
			System.out.println("Producing wagonr");
			return new WagonR(engine, wheel, body);
		}

		return null;
	}
}

public class FactoryPattern {
	public static void main(String arg[]) {
		Car booking1 = CarFactory.getCar("WagonR", "1000cc", "R14", "metallic");
		Car booking2 = CarFactory.getCar("Maruti800", "900cc", "R12", "metallic");
		Car booking3 = CarFactory.getCar("Maruti800", "900cc", "R12", "metallic");
		Car booking4 = CarFactory.getCar("WagonR", "900cc", "R12", "metallic");
	}
}
