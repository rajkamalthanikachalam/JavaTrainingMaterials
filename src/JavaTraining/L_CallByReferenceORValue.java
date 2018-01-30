/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this class, we discussed about call by Reference and Call by Value
 */
public class L_CallByReferenceORValue {

	/**
	 * @param args
	 */
	int X,Y;
	
	public int callByValue(int A, int B){
		int C = A+B; 
		System.out.println("Call by Value is "+C);
		return 0;
	}
	
	public int callByReference(L_CallByReferenceORValue z){
		z.X = 120;
		z.Y = 100;
		System.out.println(z.X);
		System.out.println(z.Y);
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		L_CallByReferenceORValue obj = new L_CallByReferenceORValue();
		obj.callByValue(10, 20); // Call by Value
		
		//callByReference
		obj.X = 100;
		obj.Y = 120;
		System.out.println(obj.X);
		System.out.println(obj.Y);
		obj.callByReference(obj);
		
		
	
	}

}
