/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this class, we explain about Function/Method (Non static Method)
 * Object must be created for calling Non static method not for Static method (example is main method)
 */
public class G_FunctionNMethod {
	/**
	 * @param args
	 */
	//No input and No Output
	public void voidMethod(){
		System.out.println("It Returns no value since void means nothing to return");
	}
	
	//no input but returns output
	public int returnMethod(){
		int A = 10;
		int B = 20;
		int C = A+B;
		return C;
	}
	
	//Input & Output
	public int io_Method(int a, int b){
		int C = a+b;
		return C;
	}
	
	public static void main(String[] args) {   
		// TODO Auto-generated method stub
		
		G_FunctionNMethod obj = new G_FunctionNMethod();
		obj.voidMethod();
		int rm = obj.returnMethod();
		System.out.println(+rm);
		int io= obj.io_Method(100, 10);
		System.out.println(+io);
			
	}

	

	

}
