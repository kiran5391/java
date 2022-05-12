package bikes;

public class Suzuki extends Bike{
	@Override
	void start() {
		System.out.println("Suzuki Starts ");
		
	}

	@Override
	void move() {
		System.out.println("Suzuki Moves ");
		
	}

	@Override
	void stop() {
		System.out.println("Suzuki Stops ");
		
	}
}
