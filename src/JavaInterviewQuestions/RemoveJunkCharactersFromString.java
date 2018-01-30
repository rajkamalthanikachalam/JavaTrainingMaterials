/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class RemoveJunkCharactersFromString {

	/**
	 * @param args
	 */
	
	private static void removeJunk() {
		// TODO Auto-generated method stub
		String S = "#@$#@$DSFDSF34235@$584";
		System.out.println(S);
		S = S.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeJunk();
		
	}

}
