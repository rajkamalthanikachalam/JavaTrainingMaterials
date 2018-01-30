/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * will talk about constructor
 * Constructor will define the current phase of object
 */
public class P_01_Constructor {

	/**
	 * @param args
	 */
	
	public P_01_Constructor(){
		System.out.println("Defualt Constructor ");
	}
	
	public P_01_Constructor(int i){
		System.out.println("Single Param Constructor " + i);
	}
	
	public P_01_Constructor(int i,int j){
		System.out.println("Single ");
		System.out.println("Two Param Constructor " + i + "and" + j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P_01_Constructor obj = new P_01_Constructor(); //Whenever object is initialized for a class, default constructor will be called
		P_01_Constructor obj1 = new P_01_Constructor(10);
		P_01_Constructor obj2 = new P_01_Constructor(10,20);
		
	}

}
