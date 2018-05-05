package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
    
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
	}
	
	// main method overloading 
	public static void main(int k) {
		System.out.println(" print the number");
	}
	
	public static void main(int k, int b) {
		System.out.println(" print the 2nd number");
	}
	
	// method over loading
	public void sum() {
		System.out.println("sum of sathisha");
	}
	
	public void sum(int a) {
		System.out.println("sum of sathisha");
		
	}
	
	public void sum(int a, int b) {
		System.out.println("sum of sathisha");
		System.out.println("sum of a+b is :" +(a+b));
		
	}
	

}
