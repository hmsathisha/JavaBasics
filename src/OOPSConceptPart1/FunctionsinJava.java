package OOPSConceptPart1;

public class FunctionsinJava {
	
	public static void main(String[] args) {
		
		FunctionsinJava obj = new FunctionsinJava();
		 obj.test();
		 
		 int l = obj.pqr();	
		 System.out.println(l);
		 
		 String s = obj.qa();
		 System.out.println(s);
		 
		 
		 int k =obj.division(30, 10);
		 System.out.println(k);
			
	}
		public void test() {
			System.out.println(" the test of method");
			}
		
		
		public int pqr() {
			int a= 10;
			int b= 20;
			int c = a+b;
			//System.out.println(c);
			return c;
		}
			
		public String qa(){
			System.out.println("this is main method");
			String s = "Selenium";
			return s;
			}
		
		
		public int division(int x, int y) {
			System.out.println("division method");
			int d = x/y;
			return d;
			
		}
						
		}
				
		
	


