package OOPSConceptPart2;

public class HSBCBank implements USBank, BelgiumBank  {
	
    public void Credit() {
    	System.out.println("HSBC bank Credit");
    }
	
	public void Debit() {
		System.out.println("HSBC bank Debit");
	}
	
	public void TransferMoney() {
		System.out.println("HSBC bank Transfer Money");
	}
	
	public void educationLoan() {
		System.out.println("HSBC eduction loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC Car Loan");
	}
	
	public void mutualFund() {
		System.out.println("Belgium bank Mutual Funds");
	}

}
