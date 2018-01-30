/**
 * 
 */
package JavaTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

/**
 * @author Raj Kamal
 * will talk about Arraylist and Hash Table
 */
public class O_ArrayList_HashTable {

	/**
	 * @param args
	 */
	
	public int arraylist(){
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add("Raj");
		ar.add('K');
		ar.add(10.54);
		System.out.println(ar.size());
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();  // Generic
		ar1.add(100);
		System.out.println(ar1.size());
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Raj");
		System.out.println(ar2.size());
		
		return 0;
			
	}
	
	public void hashTable() {
		// TODO Auto-generated method stub
		Hashtable h = new Hashtable(); 
		h.put("A","Raj");    // Key & value
		h.put("B",100);
		h.put("C",'C');
		h.put("D",100.25);
		
		System.out.println(h.size());
		System.out.println(h.get("D")); // to call , we have to use key, it can be anything - No, alphabet
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();  // to restrict the input of Key & value
		h1.put(10, 100);
		System.out.println(h1.size());
		System.out.println(h1.get(10));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O_ArrayList_HashTable obj = new  O_ArrayList_HashTable();
		obj.arraylist();
		obj.hashTable();
		
	}



	

}
