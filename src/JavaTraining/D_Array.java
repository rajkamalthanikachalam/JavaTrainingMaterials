package JavaTraining;

import java.util.Arrays;

/**
 * @author Raj Kamal
 * This class will explain about the Array 
 * Store multiple values in single variables
 * Size is Fixed -- to overcome we have to use collection[Array List, Hash Table], Dynamic Array
 * Store Similar data type - to overcome we have to Object Array
 * 
 */

public class D_Array {

	private static void oneDimensionArray() {
		// TODO Auto-generated method stub
		int [] i = new int[2];
		i[0] = 1;
		i[1] = 2;
		System.out.println("Print value first Index value :" +i[0]);
		System.out.println("Print value Second Index value :" +i[1]);
		System.out.println("Size of Array : " +i.length);
		
		for(int j=0;j<i.length;j++){
			System.out.println("Value of Array Index :" + i[j]);
		}
		
		char a[] = new char[]{'a','K'};
		System.out.println("Size of Array : " +a.length);
		for(int b=0; b<a.length;b++){
			System.out.println("Value of Array Index :" + a[b]);
		}
	
		
		String x[] = new String[]{"Raj","Kamal"};
		System.out.println("Size of Array : " +x.length);
		System.out.println(Arrays.deepToString(x));
		
		for(int y=0; y<x.length;y++){
			if(x[y].equals("Raj"))
			{
				System.out.println("You Got it");
			}
			System.out.println("Value of Array Index :" + x[y]);
		}
	}
	
	private static void ObjectArray() {    //to store different data type
		// TODO Auto-generated method stub
		Object[] ob  = new	Object[]{"X50241","Raj Kamal", "Thanikachalam",22,"July", 64086,'M'};
		System.out.println("Size of Object Array : " + ob.length);
		System.out.println(Arrays.toString(ob));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oneDimensionArray();
		ObjectArray();	
		}
}
