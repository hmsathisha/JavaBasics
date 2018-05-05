package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.start();
		b.fuel();
		b.tyre();
		
		Car c = new BMW();
		c.start();
		c.stop();
		c.fuel();
		
	}

}
