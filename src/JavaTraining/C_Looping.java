/**
 * 
 */
package JavaTraining;

import java.util.Scanner;

/**
 * @author Raj Kamal
 * This class will explain about the Looping
 */
public class C_Looping {

	private static final String Condition = null;

	/**
	 * @param args
	 */
	private static void loopWhile(int a,int b) {
		// TODO Auto-generated method stub
		while(a<=b){
			System.out.println(a);
			a++;   //if it doesn't increment,it continue with the starting number which ends in infinite loop
		}
	}
	
	private static void loopForIncrement(int a, int b) {
		// TODO Auto-generated method stub
		for(int i =a ;i<=b;i++ ){
			System.out.println(i);
		}
	}
	
	private static void loopForDecrement(int a, int b) {
		// TODO Auto-generated method stub
		for(int i =a;i>=b;i-- ){
			System.out.println(i);
		}
	}
	
	private static void loopForCondition(String a) {
		// TODO Auto-generated method stub
		
		//String a, b;
		if(a == "Inc"){
			loopForIncrement(0, 5);
		}
		else if(a == "Dec"){
			loopForDecrement(5, 0);
		}
	}

	private static void preincrement(int i) {
		// TODO Auto-generated method stub
		int a = i;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
	}

	private static void postIncrement(int i) {
		// TODO Auto-generated method stub
		int a = i;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
	}
	

	private static void preDecrement(int i) {
		// TODO Auto-generated method stub
		int a = i;
		int b = --a;
		System.out.println(a);
		System.out.println(b);
	}

	private static void postDecrement(int i) {
		// TODO Auto-generated method stub
		int a = i;
		int b = --a;
		System.out.println(a);
		System.out.println(b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loopWhile(10,15);
		System.out.println("*****************************");
		loopForIncrement(1, 10);
		System.out.println("*****************************");
		loopForDecrement(10, 0);
		System.out.println("*****************************");
		loopForCondition("Dec");
		System.out.println("*****************************");
		preincrement(10);
		System.out.println("*****************************");
		postIncrement(10);
		System.out.println("*****************************");
		preDecrement(10);
		System.out.println("*****************************");
		postDecrement(10);
		
		
	}


	
	


	
	
}
