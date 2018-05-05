package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hc = new HDFCBank();
		hc.Credit();
		hc.Debit();
		hc.loan();
		hc.funds();
		
	Bank b = new HDFCBank();
		b.Credit();
		b.Debit();
		b.loan();
		
		
		
	}

}
