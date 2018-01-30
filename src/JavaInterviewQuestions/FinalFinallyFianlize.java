/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class FinalFinallyFianlize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* its key word, value of the variable will be constant across the execution
		*  used to define a constant variable
		*  To Avoid inheritance from Parent class, A Final Parent class can't be extend by child class
		*  To prevent method overriding
		*/
	
		final int A = 10;
			
		
		// Any piece of code in Finally block will be executed, even before blocks failed/pass
		try{
			System.out.println("In Try block");
			int i =10/0;
		}catch(ArithmeticException E){
			System.out.println("In Catch block");
		}finally {
			System.out.println("In Final block");
		}
		
		//To clean up the unused object before the garbage collection start its process
		
		FinalFinallyFianlize obj1 = new FinalFinallyFianlize();
		FinalFinallyFianlize obj2 = new FinalFinallyFianlize();
		obj1 = null;
		obj2 = null;
		System.gc();
	
	}

	
}
