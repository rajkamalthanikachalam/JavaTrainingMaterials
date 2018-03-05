package Collections_Interface;

public interface Interface_Bank {
	
	/*
	 * It define a prototype
	 * In Interface, only method prototype are allowed
	 * Through Interface, complete abstractions is achieved
	 * Cannot create object for Interface class
	 * Method wrote in Children class can't be called
	 * cannot create object for Interface class
	 * by default, variable defined in interface are final & Static variable, no need to define them too
	 * 
	 * 
	 */
	
	int bankcharge = 100;
	static int locationCharge = 110;
	final int ProcessingFee = 120;
	
	public  void TransactionFee();		
	
	public void loanRate();
	
	public void InterestRate();

}
