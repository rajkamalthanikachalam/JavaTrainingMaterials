/**
 * 
 */
package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Raj Kamal
 *  In this class, we are discussing about Arraylist
 *  Array List is Dynamic in size
 *  Can contains duplicate values/elements
 *  Maintain insertion order
 *  Synchronized
 *  Allows random access to fetch elements because it stores values on basis of indexes
 */
public class Arraylist {

	/**
	 * @param args
	 */
	
	public int array() {   //Store definite size of Variable with same data type
		// TODO Auto-generated method stub
		int A[] = {1,2,3,5};
		System.out.println(Arrays.toString(A));
		for(int i =0; i < A.length ;i++){
			System.out.println(A[i]);
		}
		return 0;
	}
	
	public int arraylist(){   // can store dynamic value and different data type
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Raj");
		ar.add('K');
		ar.add(10.54);
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++){
			System.out.println("Array List Value : " + ar.get(i));
		}
		
		
	/*	ArrayList<Integer> ar1 = new ArrayList<Integer>();  // Generic
		ar1.add(100);
		System.out.println(ar1.size());
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Raj");
		System.out.println(ar2.size());
		*/
		return 0;
			
	}
	
	public int generic_NonGeneric_Arraylist(){
		
		ArrayList<Integer> ar1 = new ArrayList<>();
		//ar1.add("Selenium");
		ar1.add(20);
		ar1.add(30);
		System.out.println("Can accept only mentioned wrapper class(Integer) type");
		
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Selenium");
		//ar2.add(20);
		ar2.add("Test");
		System.out.println("Can accept only mentioned wrapper class(String) type");
				
		return 0;
		
	}
	
	public int class_ArrayList(){
		ArrayList<Employee> ar3 = new ArrayList<Employee>(); // Class specific generic datatype
		Employee e1 = new Employee(1, "Raj Kamal", "Full Time");
		Employee e2 = new Employee(2, "Dilli", "Full Time");
		Employee e3 = new Employee(3, "Ravi", "Part Time");
		
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.Emp_No +"|"+emp.Emp_Name+"|"+ emp.Emp_Type);
		}
		return 0;
	}
	
	
	public int addAll(){    // Adding argument value in one arguments
		ArrayList<String> ar4 = new ArrayList<>();
		ar4.add("Selenium");
		ar4.add("Validate");
		ar4.add("Test");
		
		ArrayList<String> ar5 = new ArrayList<>();
		ar5.add("Selenium_2");
		ar5.add("Validate_2");
		ar5.add("Test_2");
		
		ar4.addAll(ar5);
		System.out.println("***********Add All ******************");
		//System.out.println(ar4.addAll(ar5));
		for(int j = 0; j<ar4.size();j++){
			System.out.println(ar4.get(j));
		}
		return 0;
		
	}
	
	public int retainAll(){  // Retain only common value between two arguments
		ArrayList<String> ar6 = new ArrayList<>();
		ar6.add("Selenium");
		ar6.add("Validate");
		ar6.add("Test");
		
		ArrayList<String> ar7 = new ArrayList<>();
		ar7.add("Selenium");
		ar7.add("Validate_2");
		ar7.add("Test_2");
		
		ar6.retainAll(ar7);
		System.out.println("***********Retain All ******************");
		//System.out.println(ar4.addAll(ar5));
		for(int j = 0; j<ar6.size();j++){
			System.out.println(ar6.get(j));
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist obj = new Arraylist();
		obj.array();
		obj.arraylist();
		obj.generic_NonGeneric_Arraylist();
		obj.class_ArrayList();
		obj.addAll();
		obj.retainAll();
	}

}
