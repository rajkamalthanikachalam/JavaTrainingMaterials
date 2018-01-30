/**
 * 
 */
package JavaInterviewQuestions;

/**
 * @author Raj Kamal
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	
	private static void reverse() {
		// TODO Auto-generated method stub
		
		String S = "Interview";
		String rev = "";
		System.out.println("Original String : " +S);
		for(int i = S.length()-1; i>=0;i--){
			rev = rev+S.charAt(i);
		}
		System.out.println("Reversed String : "+rev);
		
		
		System.out.println("**************************************");
		//  another way
		StringBuffer obj = new StringBuffer(S);
		//obj.reverse();
		System.out.println(obj.reverse());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse();		
	}

	

}
