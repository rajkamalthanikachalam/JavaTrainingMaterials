/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class StringSwap {

	/**
	 * @param args
	 */
	
	private static void swapString() {
		// TODO Auto-generated method stub
		String A = "Hello";
		String B = "World";
		System.out.println("String Value before change :" +A);
		System.out.println("String Value before change :" +B);
		
		A = A+B;
		
		B = A.substring(0, A.length()-B.length());
		
		A = A.substring(B.length());
		
		System.out.println("String Value after change :" +A);
		System.out.println("String Value after change :" +B);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapString();
	}

	

}
