/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 *
 * in this session, we going to discuss about Inheritance, Method Overridding, Polymorphism (one to many)
 * Method Overrridding : when child & Parent class carries a small method with same arguments,
 * Preference will be given to child method when extends
 */
public class M_MethodOverriding extends L_CallByReferenceORValue{  //has a relationship

	/**
	 * @param args
	 */
	public int callByValue(int A, int B){ // Method Overriding
		int C = A+B; 
		System.out.println("Child Arraylist Value  "+ C);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M_MethodOverriding obj = new M_MethodOverriding();
		obj.callByValue(10,110);
		obj.callByReference(obj);
		
		L_CallByReferenceORValue sp = new L_CallByReferenceORValue(); //Static polymorphism 
		sp.callByValue(10, 10);
		sp.callByReference(obj);
		
		//Top Casting
		L_CallByReferenceORValue dp = new M_MethodOverriding();
		//Dynamic polymorphism - Child class object can be refereed by parent class reference variable, which is also called Run time Polymorphism
		dp.callByValue(10, 20);
		
		//Down Casting - will cast class exception
		M_MethodOverriding downcast = (M_MethodOverriding)new L_CallByReferenceORValue();
		
		
		
	}

}
