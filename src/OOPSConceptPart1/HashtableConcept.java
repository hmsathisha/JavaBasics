package OOPSConceptPart1;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable hs = new Hashtable();
		
		hs.put("A", "Sathisha");
		hs.put("B", "Shruthi");
		hs.put("C",  "Anagha");
		
		System.out.println(hs.size());
		
		hs.put(1, 100);
		hs.put(2, 200);
		hs.put(3, 300);
		
		System.out.println(hs.size());
		System.out.println(hs.get(3));
		System.out.println(hs.get("A"));
		
		for (int i=0; i<hs.size(); i++) {
			System.out.println(hs.get(i));
		}
		
		Hashtable<Integer, Integer> hs1 = new Hashtable<Integer, Integer>();
		hs1.put(10,2);
		System.out.println(hs1);
		//hs1.put("A", 4)
		
		Hashtable<Integer, String> hs2 = new Hashtable<Integer, String>();
		hs2.put(10, "A");
		System.out.println(hs2);

	}

}
