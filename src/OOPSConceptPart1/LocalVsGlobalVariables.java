package OOPSConceptPart1;

public class LocalVsGlobalVariables {
	
	String s = " Sathisha";
	double d = 23.45;
	
	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.s);
				
		int l = obj.dxc();
		System.out.println(l);
	}

	
	public int dxc() {
		int i=10;
		int j=20;
		int c = i+j;
		//System.out.println("sume of i+j is :"+c);
		return c;
	}
}
