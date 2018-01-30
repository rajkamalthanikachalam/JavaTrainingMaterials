package Collections;

import java.util.Iterator;

public class LinkedList {

	
	public int linkedList(){
		
		//LinkedList L1 = new LinkedList();		
		java.util.LinkedList<String> L1 = new java.util.LinkedList<String >();
		L1.add("are");
		L1.add("learning");
		L1.add("Linked List");
		L1.add("in");
		
		System.out.println("Linked List Value : " +L1);
		System.out.println("Linked List Value : " +L1.get(0));
		
		//Add
		L1.addFirst("We");   // Add first element from the list
		L1.addLast("in Java"); // Add last element from the list
		System.out.println("Linked List Value : " +L1);
		
		//Remove
		L1.removeFirst();   // Remove first element from the list
		L1.removeLast(); // Remove last element from the list
		L1.removeFirstOccurrence("in");
		System.out.println("Linked List Value : " +L1);
		
		//Retrieve 
		//For Loop
		System.out.println("*************Using for Loop**************");
		for(int i =0;i<L1.size();i++){
			System.out.println(L1.get(i));
		}
		
		////ForEach Loop
		System.out.println("*************Using foreach Loop**************");
		for(String str: L1){
			System.out.println(str);
		}

		////Iterator Loop
		System.out.println("*************Using Iterator Loop**************");
		Iterator<String> it = L1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		};
		
		////While Loop
		System.out.println("*************Using While Loop**************");
		int Sum = 0;
		while(L1.size()>Sum){
			System.out.println(L1.get(Sum));
			Sum++;
		}
		return 0;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList obj = new LinkedList();
		obj.linkedList();
	}
}
