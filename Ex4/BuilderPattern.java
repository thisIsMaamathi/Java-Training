package Ex4;

class Car1 {

	// required parameters
	private String engine;
	private String wheel;

	// optional parameters
	private boolean isMusicSystemEnabled;

	public String getEngine() {
		return engine;
	}

	public String getWheels() {
		return wheel;
	}

	public boolean isMusicSystemEnabled() {
		return isMusicSystemEnabled;
	}

	private Car1(CarBuilder builder) {
		this.engine = builder.engine;
		this.wheel = builder.wheel;
		this.isMusicSystemEnabled = builder.isMusicSystemEnabled;

	}

	 static class CarBuilder {

		// required parameters
		private String engine;
		private String wheel;

		// optional parameters
		private boolean isMusicSystemEnabled;

		public CarBuilder(String engine, String wheel) {
			this.engine = engine;
			this.wheel = wheel;
		}

		public CarBuilder setMusicSystemEnabled(boolean isMusicSystemEnabled) {
			this.isMusicSystemEnabled = isMusicSystemEnabled;
			return this;
		}

		public Car1 build() {
			System.out.println("Building your car. with.."+engine+wheel);
			return new Car1(this);
			
		}

	}
}

public class BuilderPattern{
	public static void main(String arg[]) {
		Car1 Maruti800= new Car1.CarBuilder("1000cc","R14").setMusicSystemEnabled(true).build();
	}
}
