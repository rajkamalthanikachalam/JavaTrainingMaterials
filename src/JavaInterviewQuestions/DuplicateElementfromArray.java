/**
 * 
 */
package JavaInterviewQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Raj Kamal
 *
 */
public class DuplicateElementfromArray {

	/**
	 * @param args
	 */
	
	private static void hashset() {
		// TODO Auto-generated method stub
		
		String name[] = {"RUBY","JAVA","PYTHON","JAVA","RUBY"};
		Set<String> storevalue = new HashSet<>();
		for(String A : name){
			if(storevalue.add(A)== false){
				System.out.println("Duplicate Elements : "  + A);
			}
			
		}
	}
	
	// Not working for my Java Version
	/*public String hashmap() {
		// TODO Auto-generated method stub
	String names[] = {"RUBY","JAVA","PYTHON","JAVA","RUBY"};
	HashMap<String, Integer> storemap= new HashMap<String, Integer>();
	for(String name :names){
			Integer count= storemap.get(name);
			if (count == null){
				storemap.put(name, 1);
			}else{
				storemap.put(name, ++count);
			}	
		}
		//Get the value from Hash map
	
	Set<Entry<String, Integer>> entryset = storemap.entrySet();
	for (Entry<String,Integer> entry :entryset){
		if(entry.getValue()>1){
			System.out.println("Duplicate entry :" + entry.getKey());
		}	
	}
	}
	*/
	private static void hashmap1(){
		String names[] = {"RUBY","JAVA","PYTHON","JAVA","RUBY"};
		Map<String, Integer> storemap= new HashMap<String, Integer>();
		for(String name :names){
				Integer count= storemap.get(name);
				if (count == null){
					storemap.put(name, 1);
				}else{
					storemap.put(name, ++count);
				}	
			}
			//Get the value from Hash map
		
		Set<java.util.Map.Entry<String,Integer>> entryset = storemap.entrySet();
		for (java.util.Map.Entry<String, Integer> entry :entryset){
			if(((java.util.Map.Entry<String, Integer>) entry).getValue()>1){
				System.out.println("Duplicate entry :" + entry.getKey());
			}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashset();
		//hashmap();
		hashmap1();
		
		
		
		
	}
	

	

}
