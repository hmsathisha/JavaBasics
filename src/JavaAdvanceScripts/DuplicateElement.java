package JavaAdvanceScripts;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String names[] = {"Java","C","python","Ruby","Java","Ruby"}; /// O(n*n) method
		
		for (int i=0; i<names.length; i++)
		{
			for (int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate elemet is:"+ names[i]);
				}
			}
		
		}
		
		//using HashSet meanse store the singel values is used in collections\
		
		Set<String> store = new HashSet<String>();
		for(String name : names) {
			
			if(store.add(name)== false) {
				System.out.println("Duplicate elemet is:"+ name);
			}
			
		}
		
		
		///Using HasMap
		
		
	}

}

