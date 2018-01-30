/**
 * 
 */
package JavaTraining;

import java.util.Arrays;

/**
 * @author Raj Kamal
 * This class will explain about the 2 dimensional Array
 */
public class E_TwoDimensioanlArray {

	/**
	 * @param args
	 */
	private static void twoDimensioanlArray() {
		// TODO Auto-generated method stub
		
		String a[][] = new String[10][5];
		System.out.println("Size of Array :" +a.length); // to get total no for Row
		System.out.println("Size of Array :" +a[0].length); // to get total no for Column
		System.out.println(Arrays.deepToString(a[5]));
		
		for(int row = 0; row<a.length; row++)
		{
			for(int col = 0; col<a[0].length;col++)
			{
				System.out.println("Print values of 2D Array :" + a[row][col]);
				System.out.println("Row Dimension Value is "+ row +" Column Dimension Value is "+ col);
			}
		}		
  	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoDimensioanlArray();
	}

}
