package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank b = new HSBCBank();
		b.carLoan();
		b.Credit();
		b.Debit();
		b.educationLoan();
		b.TransferMoney();	
		b.mutualFund();
		
		System.out.println("*****************");
		
		USBank b1 = new HSBCBank();
		b1.Credit();
		b1.Debit();
		b1.TransferMoney();
		
		
	}
	
	}
