package Collections_Abstract;

public class ICICI_Bank extends Abstract_Bank {
	/*
	 * Must extend the abstract in child class
	 * Must define the abstract method used in parent class
	 */

	
	public void TransactionFee(){		//Abstract method definition
		int transactionfee = 100; 
		System.out.println("(Abstract Method)Transaction fee is " +transactionfee);
	}
	
	public void PaymentDate(){		//Abstract method definition
		System.out.println("Banker will choose their customer Payment date");
	}
	
}
