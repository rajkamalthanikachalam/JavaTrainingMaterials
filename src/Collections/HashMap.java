/**
 * 
 */
package Collections;

import java.security.KeyStore.Entry;

/**
 * @author Raj Kamal
 * in this class, we discuss about HashMap Interface
 * HashMap Stores value in the format of Key & pair,  For Ex.Map<Key,Value>
 * HashMap<String, String> obj = new HashMap<String, String>, which denotes Key and Value must be string format 
 *
 * Real Time Example :
 * 	Error Code(1.2.1, "Fatal Error")
 * 	HashMap zip Code
 *  HashMap Manager & Employee
 *  Test Data Storage
 *  Config Variable stored
 * 
 * Notes :
 * Java HashMap class implements the map interface by using a hash table. It inherits AbstractMap class and implements Map interface. 
 * The important points about Java HashMap class are: 
 * 		A HashMap contains values based on the key. It contains only unique elements. 
 * 		It may have one null key and multiple null values. 
 * 		It maintains no order.
 * 		Hashmap is non-synchronised -- not thread safe It gives Concurrent modification exception -- in case of Fail - Fast condition
 *
 */
public class HashMap{

	/**
	 * @param args
	 * @return 
	 * @return 
	 */

	public  int hashMap() {
		// TODO Auto-generated method stub
		
		// Following hash map has same data type
		java.util.HashMap<Integer,String> hm = new java.util.HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "RFT");
		hm.put(4, "SOAPUI");
		
		System.out.println(hm.get(3));// mention the Key value 
		
		for(java.util.Map.Entry<Integer, String> m : hm.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
			
		//Remove
		hm.remove(3); // Remove the value in key provided
		System.out.println(hm.get(3));	
		return 0 ;
	}

	public  int hashMap_ClassSpecific() {
		// TODO Auto-generated method stub
		
		// Following hash map is based on class defined 
		java.util.HashMap<Integer,Employee> hm1 = new java.util.HashMap<Integer,Employee>();
		Employee emp1 = new  Employee(1, "Raj", "Full Time");
		Employee emp2 = new  Employee(2, "Dilli", "Contract");
		Employee emp3 = new  Employee(3, "Ravi", "Full Time");
		Employee emp4 = new  Employee(4, "Baskar", "C2H");
				
		hm1.put(1, emp1);
		hm1.put(2, emp2);
		hm1.put(3, emp3);
		hm1.put(4, emp4);
		
		for(java.util.Map.Entry<Integer, Employee> m : hm1.entrySet()){	
			int key  = m.getKey();
			Employee emp = m.getValue();
			System.out.println("Employee Details of "+ key + " : " + emp.Emp_No + " "+ emp.Emp_Name +" "+ emp.Emp_Type);
		}
			
		return 0 ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap obj = new HashMap();
		obj.hashMap();
		obj.hashMap_ClassSpecific();
		
	}

}
