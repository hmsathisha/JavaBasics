package OOPSConceptPart1;

public class StaticAndNonStatic {
	
	String name = "Sathisha";
	static int type =20;

	public static void main(String[] args) {
		System.out.println(type);
		System.out.println(StaticAndNonStatic.type);
		sendMail();
		
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.gamil();
		System.out.println(obj.name);
		
		//obj.type;
				
				
		
	}
	
	public void gamil(){
		System.out.println("print the gmail");
	}
	
	public static void sendMail() {
		System.out.println(" send mail to sathisha");
	}

}
