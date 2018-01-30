/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class SwapVariable {

	/**
	 * @param args
	 */
	
	private static void swapVariable() {
		// TODO Auto-generated method stub
		int A = 10;
		int B = 15;
		int temp;
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		
		temp = A;
		A = B;
		B = temp;
		System.out.println("After Interchange using temp Variable");		
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		System.out.println("***********************************************");
		//Using +/- Operator	
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("After Interchange using Addition and Subtraction");		
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		System.out.println("***********************************************");
		//Using *//- Operator	
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);		
		A = A*B;
		B = A/B;
		A = A/B;
		System.out.println("After Interchange using Multiplication and Division");		
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		System.out.println("***********************************************");		
		//Using XOR Operator	
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		A = A^B;
		B = A^B;
		A = A^B;
		System.out.println("After Interchange using XOR Operator");		
		System.out.println("Value of A : " +A);
		System.out.println("Value of B : " +B);
		System.out.println("***********************************************");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapVariable();
		

	}

	
}
