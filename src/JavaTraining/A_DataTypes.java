/**
 * 
 */
package JavaTraining;
import java.util.*;

/**
 * @author Raj Kamal
 * This class will explain about the data types
 */
public class A_DataTypes {

	int a;
	int b;
	int c; 
	
	private static void Add(int a, int b) {
		
		int c =  a +b;
		System.out.println("sum of 2 values :" + c);
	}

	private static void Sub(double a, double b) {
		
		double c =  a - b;
		System.out.println("Difference of 2 values :" + c);
	}
	private static void Mul(char  a, char b) {
		
		char c1 =  a ;
		char c2 =  b ;
		System.out.println("Display 2 characters :" + c1 + c2);
	}
	private static void Div(String a, String b) {
		
		String c =  a +" "+ b;
		System.out.println("Conc of 2 string:" + c);
	}
		
	public static void main(String[] args) {
		
		//Primitive Date Type : int, double, char,boolean
		//Getting value during run time
				
		int a,b,c ; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the 2 numbers to print : ");
		a = in.nextInt();
		b = in.nextInt();
		c = a+b;
		System.out.println("Sum of given 2 numbers is :" +c);
		
		
		Add (100,20);
		Sub(100,1.25);
		Mul('a', '@');
		Div("Raj Kamal", "Thanikachalam");
				
		/*double d1 = 100;  		// will display 100.00
		double d2 = 1.25;
		
		char c1 = 'a';
		char c2 = '@'; 			// accept special characters
		
		boolean b1 = true; 		// true/False are value also keywords available in Java
		boolean b2 = false;
		
		String s1 = "Hi" ;      //String is a class not a data type
		String s2 = "1000";*/
		
	}
	

}

