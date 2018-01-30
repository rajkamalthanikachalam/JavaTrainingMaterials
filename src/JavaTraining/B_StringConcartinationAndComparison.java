/**
 * 
 */
package JavaTraining;

/**
 * @author Raj Kamal
 * This class will explain about the string Concatenation, Comparison Operator
 *  */
public class B_StringConcartinationAndComparison {

	/**
	 * @param args
	 */
	private static void Conc2(int i, int j, String a, String b) {
		// TODO Auto-generated method stub
		String C1 = i+j+a+b;
		System.out.println("Concartination of 4 value :" + C1);
	}

	private static void Conc1(String a, String b, int i, int j) {
		// TODO Auto-generated method stub
		String C2 = a+b+i+j;
		System.out.println("Concartination of 4 value :" + C2);
	}
	
	private static void Compariosn(int i, int j) {
		// TODO Auto-generated method stub
		if((i<j))
		{
			System.out.println("J is Greater");
		}else if (i>j) {
			System.out.println("I is Greater");
		}else if (i!=j) {
			System.out.println("I is not equal to J");
		}else if (i==j) {
			System.out.println("I,J are equal");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conc1("Raj","Kamal",100,200);  // String following integer will be Concatenated
		Conc2(100, 200,"Raj","Kamal"); // Integer following string will sum the integer first
		Compariosn(1000,1001); //Comparison operator are <,>,<=,>=,!=,==
	}

	

	

	

}
