/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this class, we discuss about the Method Overloading
 * 
 * Method Overloading : Same method name with different argument/input type within in the same class
 * Main method can be method overloaded
 * Same method name with different data type are allowed
 */
public class I_MethodOverloading {

	/**
	 * @param args
	 * @return 
	 */
	
	public void method1(){
		System.out.println("Method with no Arguemnts");
	}
	public void method1(int A){
		System.out.println("Method with single Arguemnts");
		System.out.println(+A);
	}
	public void method1(int A , int B){
		System.out.println("Method with two Arguemnts");
		System.out.println(A+B);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I_MethodOverloading obj = new I_MethodOverloading();
		obj.method1();
		obj.method1(10);
		obj.method1(10,15);
	}

}
