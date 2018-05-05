package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
    String x = "100";
   int i = Integer.parseInt(x);
    System.out.println(i);
    
    String y = "12.23";
    double d =Double.parseDouble(y);
    System.out.println(d);    
    
    String z = "true";
    boolean b = Boolean.parseBoolean(z);
    System.out.println(b);
    
    int m = 200;
    String s = String.valueOf(m);
    System.out.println(s+34);
    
    
	}

}
