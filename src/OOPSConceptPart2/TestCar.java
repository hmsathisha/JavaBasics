package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW b =  new BMW();
		b.start();
		b.fuel();
		b.stop();
		b.theftsaftey();
		b.engine();
		
		System.out.println("**************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.fuel();
		
		System.out.println("**************");
		
		/// top casting
		 Car c1 =new BMW();
		 c1.start();
		 c1.stop();
		 c1.fuel();
		 
		 System.out.println("**************");
		 
		 /// down costing 
		 BMW b1 = (BMW)new Car();
		 
		  
		 
	}
	
		}
