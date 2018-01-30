/**
 * 
 */
package JavaInterviewQuestions;

import java.util.Arrays;

/**
 * @author Raj Kamal
 *
 */
public class LargestAndSmallestNumberInArray {

	/**
	 * @param args
	 */
	
	private static void largestNsmallest() {
		// TODO Auto-generated method stub
		
		int A[] = {10,-88,1,-20,100,9829848,22,-158};
		int largest = A[0];
		int smallest = A[0];
		
		for(int i =0; i<A.length;i++){
			if(A[i]>largest){
				largest = A[i];				
			}else if(A[i]<smallest){
				smallest = A[i];
			}
		}
		System.out.println(Arrays.toString(A));
		System.out.println("Larget No : " + largest);
		System.out.println("Smallest No : " + smallest);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestNsmallest();
	}

	
}
