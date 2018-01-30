package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {
	
	/*
	 * This class implements a hash table, which maps keys to values. 
	 * Any non-null object can be used as a key or as a value. 
	 * +It is similar to HashMap, but is synchronised. 
	 * +Hashtable stores key/value pair in hash table. 
	 * +In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. 
	 * The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table. 
	 * The important points about Java Hashtable class are: A Hashtable is an array of list. Each list is known as a bucket. 
	 * The position of bucket is identified by calling the hashcode() method. 
	 * A Hashtable contains values based on the key. 
	 * +It contains only unique elements. 
	 * +It may have not have any null key or value. 
	 * +It is synchronized.
	 *  
	 */
	
	public int hashTable(){
		
		Hashtable h1 = new Hashtable();
		h1.put(1, "JAVA");
		h1.put(2, ".NET");
		h1.put(3, "PYTHON");
		h1.put(4, "VB");
		
		System.out.println(h1.get(4));
		
		//Clone - to copy a value from one object to other object
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		System.out.println("Clone - Clone Value of h1 : " +h1);
		System.out.println("Clone - Clone Value of h2 : " +h2);
		
		//clear value from object, but other object carries the value
		h1.clear();
		System.out.println("Clear - Cleared Value of h1 : " +h1);
		System.out.println("Clear - Cleared Value of h2 : " +h2);
		
		//contains Value
		
		if(h2.containsValue("PYTHON")){
			System.out.println("Contains Value - Expected value is available");
		}
		else{
			System.out.println("Contains Value - Expected value is not available");
		}
		
		//Equals		
		
		if(h2.equals(h1)){
			System.out.println("Equals - Both object carries same value");
		}
		else{
			System.out.println("Equals - Both object carries different values");
		}
		
		//Iteration using Enum and Set 
		
		//using Enumeration 
		Enumeration e = h2.elements();
		while(e.hasMoreElements()){
			System.out.println("Enumeration - Iteration of Enum value H2 : " + e.nextElement());
		}
		
		//using set 
		Set st = h2.entrySet();
		System.out.println("Entry Set - Iteration of set Value H2 :" + st);
		
		//Hashcode   - If both object carries same value, it shares the same hash code 
		System.out.println("HashCode - Hashcode value of a object H2:" + h2.hashCode());
		System.out.println("HashCode - Hashcode value of a object H1:" + h1.hashCode());
		
		return 0;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashTable obj = new HashTable();
		obj.hashTable();
		
		
		
	}

}
