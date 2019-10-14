package InterviewQuestions;

public class Encapsulation {
	
	/* Encapuslation: Outside member will not access the variable
	 * 
	 * Binding the variable and method
	 * 
	 * Private variables are access through the public method(getter & setter) in the same class, through the method
	 * other class can access it
	 * 
	 * Encapsulation is one of the four fundamental OOP concepts.
	 *  
	 * Encapsulation is the technique of making the fields in a class private and providing access to the fields 
	 * via public methods. 
	 * 
	 * If a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding the fields 
	 * within the class 
	 * 
	 * Encapsulation is one of the four fundamental OOP concepts.
	 * 
	 * Encapsulation can be defined as a process of wrapping code and data together into a single unit. 
	 * 
	 * Encapsulation is the technique of making the fields in a class private and providing access to the fields 
	 * via public methods. If a field is declared private, it cannot be accessed by anyone outside the class, 
	 * thereby hiding the fields within the class.
	 * 
	 */
	
	private String UserName;
	private String UserAccount;
	private int UserSSN;
	
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}

	public String getUserAccount() {
		return UserAccount;
	}

	public void setUserAccount(String userAccount) {
		this.UserAccount = userAccount;
	}

	public int getUserSSN() {
		return UserSSN;
	}

	public void setUserSSN(int userSSN) {
		this.UserSSN = userSSN;
	}

	
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setUserName("Raj Kamal");
		obj.setUserAccount("Saving");
		obj.setUserSSN(002512);
		
		System.out.println("User Name"+ obj.getUserName());
		System.out.println("User Account"+ obj.getUserAccount());
		System.out.println("User SSN"+ obj.getUserSSN());
	}

}
