package OOPSConceptPart1;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("C");
		ar.add('d');
		ar.add(200);
		ar.add(200.55);
		ar.remove(4);
		
		System.out.println(ar.size()); // to get the size
		System.out.println(ar.get(2)); // to get the value
		
		for( int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		//ar2.add(100); wont allow other than string value
		ar2.add("Sathisha");
		System.out.println(ar2);
		

	}

}
