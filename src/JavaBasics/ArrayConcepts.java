package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] =10;
		i[1] =20;
		i[2] =30;
		i[3] =40;
		System.out.println(i[2]);
		System.out.println(i.length);
		
		double j[] = new double[4];
		j[0] =10;
		j[1] =20;
		j[2] =30;
		j[3] =40; 
		System.out.println(j[2]);
		
		
		boolean  k[] = new boolean[2];
		k[0] =true;
		k[1] =false;
		System.out.println(k[2]);
		
		String s[] = new String[4];
		s[0] = "Sathisha";
		s[1] = " Anagaha";
		s[2] = " Shruthi";
		
		System.out.println(" My Daughter is :" +s[1]);
		
		Object ob[] = new Object[5];
		ob[0] = " Name";
		ob[1] = "11/11/1998";
		ob[2] = 'G';
		ob[3] = "City";
		ob[4] = 12.55;
		System.out.println(ob[1]);

		
		
 
	}

}
