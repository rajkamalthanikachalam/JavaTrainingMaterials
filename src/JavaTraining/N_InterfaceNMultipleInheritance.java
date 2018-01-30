/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this session, we are going to discuss about Interface and Multiple Inheritance
 * Interface doesn't have main method
 * 
 * All method must be override in interface and it can have its own method also
 * Multiple Inheritance = Is a relationship
 */
public class N_InterfaceNMultipleInheritance implements N_Interface{

	/**
	 * @param args
	 */
	
	public void credit(){
		System.out.println("DayFouteen credit method");
	}
	public void debit(){
		System.out.println("DayFouteen Debit method");
	}
	public void transfer(){
		System.out.println("DayFouteen transfer method");
	}
	public void loan(){
		System.out.println("own loan method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N_InterfaceNMultipleInheritance obj = new N_InterfaceNMultipleInheritance();
		obj.credit();
		obj.debit();
		obj.transfer();
		obj.loan();
		
		
		//dynamic polymorphism - child class object can be refereed by parent class reference variable/interface
		N_Interface DP = new N_InterfaceNMultipleInheritance();
		DP.credit();
		DP.debit();
		DP.transfer();
		

	}
	

}
