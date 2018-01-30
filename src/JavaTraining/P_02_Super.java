package JavaTraining;

public class P_02_Super extends P_01_Constructor {
	/*
	 * Super keyword is used to call constructor from parent class
	 * Only one super keyword can used
	 * 
	 */
	
	public P_02_Super(){
		super(10); // Super will call constructor from parent class 
		//it should be the first line and only once it will be called
		//Constructor can be overloaded
		//Super constructor will be based on its parameter
		System.out.println("Child Class constructor");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_02_Super obj = new P_02_Super();
	}

}
