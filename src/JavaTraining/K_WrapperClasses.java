	/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * in this class, we discussed about wrapper class(Integer, Double, Char, String)
 *
 */
public class K_WrapperClasses {

	/**
	 * @param args
	 */
	public int wrapper(){
		String X = "100";
		System.out.println(X+20);
		
		int i = Integer.parseInt(X); // Integer is a wrapper class
		System.out.println(i+20);
			
		double j = Double.parseDouble(X);
		System.out.println(j+10.50);
		
		String Y = "True";
		boolean z = Boolean.parseBoolean(Y);
		System.out.println(z);
		
		int a = 200;
		String b = String.valueOf(a);
		System.out.println(a);
		
		return 0;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K_WrapperClasses obj = new K_WrapperClasses();
		obj.wrapper();

	}

}
