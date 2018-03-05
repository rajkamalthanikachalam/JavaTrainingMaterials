package Collections_Abstract;

public abstract class Abstract_Bank {
	/*
	 * It defines the prototype
	 * abstract key word must be used 
	 * One abstract method should be used and n no of non abstract can be used
	 * Through Abstraction method, partial abstraction is possible
	 * Cannot create object for Abstract class
	 * 
	 * In Child Class
	 * Must extend the abstract in child class
	 * Must define the abstract method used in parent class 
	 * 
	 */
	
	int bankcharge = 100;
	static int locationCharge = 100;
	final int ProcessingFee = 100;
	
	
	public abstract void TransactionFee();		// Abstract Method
	
	public void loanRate(){						// Non Abstract Method
		System.out.println("Bank -- Loan Rate Method");
	}
	
	public void InterestRate(){					// Non Abstract Method
		System.out.println("Bank -- Interest Rate Method");
	}

}
