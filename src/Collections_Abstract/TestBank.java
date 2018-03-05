package Collections_Abstract;

public class TestBank {

	public static void main(String[] args) {
		
		/*
		 * Method wrote in Children class can't be called thru dynamic polymorphism
		 * cannot create object for Abstract class
		 */
		
		//Collections_Abstract obj = new Collections_Abstract();  //cannot create object for Abstract class
		
		System.out.println("******************Abstract*********************");		
		ICICI_Bank B1 = new ICICI_Bank(); //Thru Child class reference Object
		B1.TransactionFee();
		B1.InterestRate();
		B1.loanRate();
		B1.PaymentDate();
		
		System.out.println("******************Thru Dynamic Polymorphism/Type Casting*********************");
		
		Abstract_Bank B2 = new ICICI_Bank();
		B2.TransactionFee();
		B2.InterestRate();
		B2.loanRate();
		//B2.PaymentDate()    //Method wrote in Children class can't be called

	}

}
