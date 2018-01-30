/**
 * 
 */
package JavaInterviewQuestions;

import java.util.Arrays;

/**
 * @author Raj Kamal
 *
 */
public class StringManipulation {

	/**
	 * @param args
	 */
	
	private static void stringManip() {
		// TODO Auto-generated method stub
		String A = "today weather is not so sunny";
		
		System.out.println(A.length()); //to get length of String
		System.out.println(A.charAt(6)); // To get char at specific index
		
		System.out.println(A.indexOf('t')); // Occurrence of a char in string
		System.out.println(A.indexOf('t', A.indexOf('t')+1)); // second Occurrence of a char
		int B = A.indexOf('o', A.indexOf('o')+1);
		System.out.println(B);
		System.out.println(A.indexOf('o',A.indexOf('o', B+1))); // third Occurrence of a character 
		
		
		System.out.println(A.indexOf("is")); // index of string
		System.out.println(A.indexOf("Hai")); // non available string 
		
		System.out.println(A.equals("Today weather is not so sunny")); // Case Senstitive
		System.out.println(A.equalsIgnoreCase("Today weather is not so sunny")); // ignore cases
		
		System.out.println(A.substring(2, 15));
		
		System.out.println(A.trim()); //it remove left and right spaces
		System.out.println(A.replace(" ", "")); // to remove center spaces
		
		String[] C = A.split(" ");
		System.out.println(Arrays.toString(C));
		
		String X = "Hello";
		String Y = "World";
		int X1 = 100;
		int Y1 = 200;
		
		System.out.println(X+Y+X1+Y1); //Helloworld100200
		System.out.println(X1+Y1+X+Y); //300HelloWorld
		System.out.println(X+Y+(X1+Y1));//HelloWorld300
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringManip();
		
	}

	

}
