package OOPSConceptPart1;

public class CallbyValueCallbyReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallbyValueCallbyReference obj = new CallbyValueCallbyReference();
		int  x = 10;
		int  y = 20;
		int  z = x+y;
        obj.testsum(x, y); // call by value
		System.out.println(z);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);	
		System.out.println(obj.q);	

	}

	public int testsum(int a, int b) {
		 a = 30;
		 b = 40;
		int c =a+b;
		System.out.println(c);
		return c;
	}
		public void swap(CallbyValueCallbyReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
			
		}
		
		
	}
	
	
	

