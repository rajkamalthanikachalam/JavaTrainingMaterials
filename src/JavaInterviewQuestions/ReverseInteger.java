/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */

	private static void reverseInteger() {
		// TODO Auto-generated method stub
		int i = 987654321;
		int rev = 0;

		while (i != 0) {
			rev = rev * 10 + i % 10;
			i = i / 10;
		}
		System.out.println(rev);
		System.out.println("***********");

		int i1 = 123456789;
		System.out.println(new StringBuffer(String.valueOf(i1)).reverse());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseInteger();

	}

}
