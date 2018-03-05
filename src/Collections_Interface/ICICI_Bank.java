package Collections_Interface;

public class ICICI_Bank implements Interface_Bank {
	
	/*
	 * Must implements the interface class in child class
	 * Must define the abstract method used in parent class
	 * 
	 * 
	 * 
	 */
	
	public void TransactionFee(){						
		System.out.println("Bank -- Loan Rate Method");
	}
	
	public void loanRate(){					
		System.out.println("Bank -- Loan Rate Method");
	}
	
	public void InterestRate(){				
		System.out.println("Bank -- Interest Rate Method");
	}

	public void PaymentDate() {
		System.out.println("Banker will choose their customer Payment date");
		
	}

}
